package ua.store.domain.factory;

import org.springframework.stereotype.Component;
import ua.store.domain.model.Review;
import ua.store.domain.repository.ProductRepository;
import ua.store.domain.repository.UserRepository;
import ua.store.web.dto.ReviewDTORequest;
import ua.store.web.dto.ReviewDTOResponse;

@Component
public class ReviewFactory {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final UserFactory userFactory;

    public ReviewFactory(ProductRepository productRepository, UserRepository userRepository, UserFactory userFactory) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.userFactory = userFactory;
    }

    public Review fromDto(ReviewDTORequest review) {
        return Review.builder()
                .id(review.getId())
                .product(productRepository.findById(review.getProductId()).orElseThrow())
                .reviewOwner(userRepository.findById(review.getUserId()).orElseThrow())
                .build();
    }

    public ReviewDTOResponse toDto(Review review) {
        return ReviewDTOResponse.builder()
                .text(review.getText())
                .owner(userFactory.toDto(review.getReviewOwner()))
                .build();
    }
}
