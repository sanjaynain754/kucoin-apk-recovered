package com.sumsub.sns.core.theme;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSTypographyElement;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BODY", "CAPTION", "HEADLINE1", "HEADLINE2", "SUBTITLE1", "SUBTITLE2", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSTypographyElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTypographyElement.kt\ncom/sumsub/sns/core/theme/SNSTypographyElement\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,17:1\n11228#2:18\n11563#2,3:19\n*S KotlinDebug\n*F\n+ 1 SNSTypographyElement.kt\ncom/sumsub/sns/core/theme/SNSTypographyElement\n*L\n14#1:18\n14#1:19,3\n*E\n"})
public enum SNSTypographyElement {
    BODY(TtmlNode.TAG_BODY),
    CAPTION("caption"),
    HEADLINE1("headline1"),
    HEADLINE2("headline2"),
    SUBTITLE1("subtitle1"),
    SUBTITLE2("subtitle2");


    @NotNull
    private static final List<String> names;

    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSTypographyElement$Companion;", "", "<init>", "()V", "names", "", "", "getNames", "()Ljava/util/List;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final List<String> getNames() {
            return SNSTypographyElement.names;
        }
    }

    static {
        SNSTypographyElement[] sNSTypographyElementArrValues = values();
        ArrayList arrayList = new ArrayList(sNSTypographyElementArrValues.length);
        for (SNSTypographyElement sNSTypographyElement : sNSTypographyElementArrValues) {
            arrayList.add(sNSTypographyElement.value);
        }
        names = arrayList;
    }

    @NotNull
    public static EnumEntries<SNSTypographyElement> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    SNSTypographyElement(String str) {
        this.value = str;
    }
}
