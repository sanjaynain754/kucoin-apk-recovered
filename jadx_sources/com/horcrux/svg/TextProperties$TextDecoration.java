package com.horcrux.svg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum TextProperties$TextDecoration {
    None("none"),
    Underline(TtmlNode.UNDERLINE),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");


    /* JADX INFO: renamed from: b */
    public static final Map<String, TextProperties$TextDecoration> f13138b = new HashMap();
    private final String decoration;

    static {
        for (TextProperties$TextDecoration textProperties$TextDecoration : values()) {
            f13138b.put(textProperties$TextDecoration.decoration, textProperties$TextDecoration);
        }
    }

    public static TextProperties$TextDecoration getEnum(String str) {
        Map<String, TextProperties$TextDecoration> map = f13138b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.decoration;
    }

    TextProperties$TextDecoration(String str) {
        this.decoration = str;
    }
}
