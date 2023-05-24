package com.dongjun.djlog.service;

import com.dongjun.djlog.domain.Article;
import com.dongjun.djlog.dto.AddArticleRequest;
import com.dongjun.djlog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않은 ID ==> " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }
}
