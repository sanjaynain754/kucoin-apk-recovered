package com.horcrux.svg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33789m5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum TextProperties$FontWeight {
    Normal(C33789m5.f70921k),
    Bold(TtmlNode.BOLD),
    w100(C33556b3.f68995S),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");


    /* JADX INFO: renamed from: b */
    public static final Map<String, TextProperties$FontWeight> f13135b = new HashMap();
    private final String weight;

    static {
        for (TextProperties$FontWeight textProperties$FontWeight : values()) {
            f13135b.put(textProperties$FontWeight.weight, textProperties$FontWeight);
        }
    }

    public static TextProperties$FontWeight get(String str) {
        return f13135b.get(str);
    }

    public static boolean hasEnum(String str) {
        return f13135b.containsKey(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.weight;
    }

    TextProperties$FontWeight(String str) {
        this.weight = str;
    }
}
