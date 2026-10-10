package com.kubi.kucoin.home.p090v2.cards;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.home.v2.cards.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: BaseCardDataV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J%\u0010*\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005`\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020#HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00066"}, m90084d2 = {"Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "", "code", "", TtmlNode.TAG_STYLE, "Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "styleList", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "title", "content", "draggable", "", "repeatable", "extraData", "defaultData", "<init>", "(Ljava/lang/String;Lcom/kubi/kucoin/home/v2/cards/CardStyle;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getStyle", "()Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "getStyleList", "()Ljava/util/LinkedHashMap;", "getTitle", "getContent", "getDraggable", "()Z", "getRepeatable", "getExtraData", "setExtraData", "(Ljava/lang/String;)V", "getDefaultData", "setDefaultData", "id", "", "getId", "()I", "setId", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "LCardFlow_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class BaseCardDataV2 {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String code;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final CardStyle style;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final LinkedHashMap<String, CardStyle> styleList;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final String content;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean draggable;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final boolean repeatable;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public String extraData;

    /* JADX INFO: renamed from: i, reason: from toString */
    @Nullable
    public String defaultData;

    /* JADX INFO: renamed from: j */
    public int f27926j;

    public BaseCardDataV2(@NotNull String code, @NotNull CardStyle style, @NotNull LinkedHashMap<String, CardStyle> styleList, @Nullable String str, @Nullable String str2, boolean z11, boolean z12, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(styleList, "styleList");
        this.code = code;
        this.style = style;
        this.styleList = styleList;
        this.title = str;
        this.content = str2;
        this.draggable = z11;
        this.repeatable = z12;
        this.extraData = str3;
        this.defaultData = str4;
        this.f27926j = (code + style.getName() + str + str2 + this.extraData).hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseCardDataV2)) {
            return false;
        }
        BaseCardDataV2 baseCardDataV2 = (BaseCardDataV2) other;
        return Intrinsics.areEqual(this.code, baseCardDataV2.code) && Intrinsics.areEqual(this.style, baseCardDataV2.style) && Intrinsics.areEqual(this.styleList, baseCardDataV2.styleList) && Intrinsics.areEqual(this.title, baseCardDataV2.title) && Intrinsics.areEqual(this.content, baseCardDataV2.content) && this.draggable == baseCardDataV2.draggable && this.repeatable == baseCardDataV2.repeatable && Intrinsics.areEqual(this.extraData, baseCardDataV2.extraData) && Intrinsics.areEqual(this.defaultData, baseCardDataV2.defaultData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BaseCardDataV2 m32246b(BaseCardDataV2 baseCardDataV2, String str, CardStyle cardStyle, LinkedHashMap linkedHashMap, String str2, String str3, boolean z11, boolean z12, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = baseCardDataV2.code;
        }
        if ((i11 & 2) != 0) {
            cardStyle = baseCardDataV2.style;
        }
        if ((i11 & 4) != 0) {
            linkedHashMap = baseCardDataV2.styleList;
        }
        if ((i11 & 8) != 0) {
            str2 = baseCardDataV2.title;
        }
        if ((i11 & 16) != 0) {
            str3 = baseCardDataV2.content;
        }
        if ((i11 & 32) != 0) {
            z11 = baseCardDataV2.draggable;
        }
        if ((i11 & 64) != 0) {
            z12 = baseCardDataV2.repeatable;
        }
        if ((i11 & 128) != 0) {
            str4 = baseCardDataV2.extraData;
        }
        if ((i11 & 256) != 0) {
            str5 = baseCardDataV2.defaultData;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z13 = z11;
        boolean z14 = z12;
        String str8 = str3;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        return baseCardDataV2.m32247a(str, cardStyle, linkedHashMap2, str2, str8, z13, z14, str6, str7);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final BaseCardDataV2 m32247a(@NotNull String code, @NotNull CardStyle style, @NotNull LinkedHashMap<String, CardStyle> styleList, @Nullable String str, @Nullable String str2, boolean z11, boolean z12, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(styleList, "styleList");
        return new BaseCardDataV2(code, style, styleList, str, str2, z11, z12, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDefaultData() {
        return this.defaultData;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getDraggable() {
        return this.draggable;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getExtraData() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF27926j() {
        return this.f27926j;
    }

    public int hashCode() {
        int iHashCode = ((((this.code.hashCode() * 31) + this.style.hashCode()) * 31) + this.styleList.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.draggable)) * 31) + Boolean.hashCode(this.repeatable)) * 31;
        String str3 = this.extraData;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.defaultData;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRepeatable() {
        return this.repeatable;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final CardStyle getStyle() {
        return this.style;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final LinkedHashMap<String, CardStyle> m32256k() {
        return this.styleList;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public String toString() {
        return "BaseCardDataV2(code=" + this.code + ", style=" + this.style + ", styleList=" + this.styleList + ", title=" + this.title + ", content=" + this.content + ", draggable=" + this.draggable + ", repeatable=" + this.repeatable + ", extraData=" + this.extraData + ", defaultData=" + this.defaultData + ')';
    }

    public /* synthetic */ BaseCardDataV2(String str, CardStyle cardStyle, LinkedHashMap linkedHashMap, String str2, String str3, boolean z11, boolean z12, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cardStyle, (i11 & 4) != 0 ? new LinkedHashMap() : linkedHashMap, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5);
    }
}
