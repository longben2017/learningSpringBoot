package com.longgq.domain.secondary;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by clouder on 17-12-13.
 */
public interface MessageRepository extends JpaRepository<Message,Long> {
}
