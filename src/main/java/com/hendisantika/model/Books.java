package com.hendisantika.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kafka-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/12/21
 * Time: 06.46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private String bookName;
    private String author;
}
