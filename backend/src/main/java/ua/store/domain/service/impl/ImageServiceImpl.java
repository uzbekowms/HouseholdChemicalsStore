package ua.store.domain.service.impl;


import jakarta.servlet.ServletContext;
import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;
import ua.store.domain.service.ImageService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.UUID;

@Service
public class ImageServiceImpl implements ImageService {

    private final ServletContext context;

    public ImageServiceImpl(ServletContext context) {
        this.context = context;
    }

    @Override
    public String save(MultipartFile file) {
        if (file.isEmpty()) {
            throw new IllegalArgumentException("Please select a file to upload");
        }
        try {
            String fileName = UUID.randomUUID() + "." + FilenameUtils.getExtension(file.getOriginalFilename());
            String uploadDir = new FileSystemResource("").getFile().getAbsolutePath() + "/images/";

            File dest = new File(uploadDir + fileName);
            System.out.println(dest);
            file.transferTo(dest);

            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Something went wrong while uploading image");
        }
    }

    @Override
    public Resource get(String name) throws FileNotFoundException {
        Path imagePath = ResourceUtils.getFile(new FileSystemResource("").getFile().getAbsolutePath() + "/images/" + name).toPath();
        System.out.println(imagePath);
        Resource resource = new FileSystemResource(imagePath);
        if (!resource.exists())
            throw new FileNotFoundException("Cannot find image with name: " + name);

        return resource;
    }
}
