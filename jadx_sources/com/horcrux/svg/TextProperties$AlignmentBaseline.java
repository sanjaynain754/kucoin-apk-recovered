package com.horcrux.svg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
enum TextProperties$AlignmentBaseline {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom(ViewProps.BOTTOM),
    center(TtmlNode.CENTER),
    top(ViewProps.TOP),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");


    /* JADX INFO: renamed from: b */
    public static final Map<String, TextProperties$AlignmentBaseline> f13131b = new HashMap();
    private final String alignment;

    static {
        for (TextProperties$AlignmentBaseline textProperties$AlignmentBaseline : values()) {
            f13131b.put(textProperties$AlignmentBaseline.alignment, textProperties$AlignmentBaseline);
        }
    }

    public static TextProperties$AlignmentBaseline getEnum(String str) {
        Map<String, TextProperties$AlignmentBaseline> map = f13131b;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.alignment;
    }

    TextProperties$AlignmentBaseline(String str) {
        this.alignment = str;
    }
}
