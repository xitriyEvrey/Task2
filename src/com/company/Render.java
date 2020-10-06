package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Render {


    //Стоит начать с этого
    public static void renderLine(BufferedImage img, int x1, int y1, int x2, int y2, Color color) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        for (int x = Math.min(x1, x2); x <= Math.max(x1, x2); x++) {
            for (int y = Math.min(y1, y2); y <= Math.max(y1, y2); y++) {
                if (dx > dy) {
                    img.setRGB(x, ((x - x1) * (y2 - y1) / (x2 - x1)) + y1, color.getRGB());
                } else {
                    img.setRGB(((y - y1) * (x2 - x1) / (y2 - y1)) + x1, y, color.getRGB());
                }
            }
        }
    }
}