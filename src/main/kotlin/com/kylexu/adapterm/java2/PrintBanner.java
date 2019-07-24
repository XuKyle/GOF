package com.kylexu.adapterm.java2;

import com.kylexu.adapterm.java.Banner;

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
