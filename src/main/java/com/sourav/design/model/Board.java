package com.sourav.design.model;

import lombok.Getter;

@Getter
public class Board {
    private final int size;
    private final int start;
    private final int end;

    public Board(int size) {
        this.start = 1;
        this.end = start + size - 1;
        this.size = size;
    }
}
