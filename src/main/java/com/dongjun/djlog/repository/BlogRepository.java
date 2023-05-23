package com.dongjun.djlog.repository;

import com.dongjun.djlog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
