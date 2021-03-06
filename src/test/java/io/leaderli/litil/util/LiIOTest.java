package io.leaderli.litil.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiIOTest {

    @Test
    public void testCreateContentStream() {

        String content = "123";
        InputStream inputStream = LiIO.createContentStream(content);
        String text = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).lines().collect(Collectors.joining("\n"));
        assertEquals(content, text);
    }
}
