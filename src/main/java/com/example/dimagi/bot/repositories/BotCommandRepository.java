package com.example.dimagi.bot.repositories;

import com.example.dimagi.bot.entities.BotCommand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotCommandRepository extends JpaRepository<BotCommand, Integer> {

    public BotCommand findByName(String name);
}
