package org.fluent.pattern;

import org.fluent.pattern.dto.EmailContext;

public class Main {
    public static void main(String[] args) {
        var emailContext = EmailContext.builder()
                .useCase("useCase")
                        .country("country")
                                .language("EN").business("RETAIL")
                        .channel("WEB")
                                .segment("TEST")
                                        .build();


        System.out.println(emailContext.toString());
    }
}
