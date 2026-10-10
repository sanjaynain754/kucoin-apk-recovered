package com.jumio.core.data.document;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.data.document.DocumentFormat[], still in use, count: 1, list:
  (r0v1 com.jumio.core.data.document.DocumentFormat[]) from 0x00a2: INVOKE (r0v1 com.jumio.core.data.document.DocumentFormat[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:165)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BA\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006!"}, m90084d2 = {"Lcom/jumio/core/data/document/DocumentFormat;", "", "overlayTop", "", "overlayBottom", "overlayLeft", "overlayRight", "overlayRatio", "roiHeight", ViewProps.MARGIN_BOTTOM, "<init>", "(Ljava/lang/String;IDDDDDDD)V", "getOverlayTop", "()D", "getOverlayBottom", "getOverlayLeft", "getOverlayRight", "getOverlayRatio", "getRoiHeight", "getMarginBottom", "NONE", "ID1", "ID2", "ID3", "getOverlayLeftInPx", "", "overlayWidth", "getOverlayRightInPx", "getOverlayTopInPx", "overlayHeight", "getOverlayBottomInPx", "getRoiHeightInPx", "getRoiMarginBottomPx", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DocumentFormat {
    NONE(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d),
    ID1(0.136d, 0.136d, 0.0675d, 0.0675d, 1.585185185185185d, 0.24000000000000002d, 0.09546296296296297d),
    ID2(0.0936d, 0.0936d, 0.0675d, 0.0675d, 1.4189189189189189d, 0.17162162162162162d, 0.08412162162162162d),
    ID3(0.022d, 0.022d, 0.022d, 0.022d, 1.4119318181818181d, 0.2353181818181818d, 0.0d);


    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumEntries f13799i;

    /* JADX INFO: renamed from: a */
    public final double f13800a;

    /* JADX INFO: renamed from: b */
    public final double f13801b;

    /* JADX INFO: renamed from: c */
    public final double f13802c;

    /* JADX INFO: renamed from: d */
    public final double f13803d;

    /* JADX INFO: renamed from: e */
    public final double f13804e;

    /* JADX INFO: renamed from: f */
    public final double f13805f;

    /* JADX INFO: renamed from: g */
    public final double f13806g;

    public final int getOverlayBottomInPx(int overlayHeight) {
        return (int) (((double) overlayHeight) * this.f13801b);
    }

    public final int getOverlayLeftInPx(int overlayWidth) {
        return (int) (((double) overlayWidth) * this.f13802c);
    }

    public final int getOverlayRightInPx(int overlayWidth) {
        return (int) (((double) overlayWidth) * this.f13803d);
    }

    public final int getOverlayTopInPx(int overlayHeight) {
        return (int) (((double) overlayHeight) * this.f13800a);
    }

    static {
        f13799i = EnumEntriesKt.enumEntries(documentFormatArr);
    }

    @NotNull
    public static EnumEntries<DocumentFormat> getEntries() {
        return f13799i;
    }

    public static DocumentFormat valueOf(String str) {
        return (DocumentFormat) Enum.valueOf(DocumentFormat.class, str);
    }

    public static DocumentFormat[] values() {
        return (DocumentFormat[]) f13798h.clone();
    }

    /* JADX INFO: renamed from: getMarginBottom, reason: from getter */
    public final double getF13806g() {
        return this.f13806g;
    }

    /* JADX INFO: renamed from: getOverlayBottom, reason: from getter */
    public final double getF13801b() {
        return this.f13801b;
    }

    /* JADX INFO: renamed from: getOverlayLeft, reason: from getter */
    public final double getF13802c() {
        return this.f13802c;
    }

    /* JADX INFO: renamed from: getOverlayRatio, reason: from getter */
    public final double getF13804e() {
        return this.f13804e;
    }

    /* JADX INFO: renamed from: getOverlayRight, reason: from getter */
    public final double getF13803d() {
        return this.f13803d;
    }

    /* JADX INFO: renamed from: getOverlayTop, reason: from getter */
    public final double getF13800a() {
        return this.f13800a;
    }

    /* JADX INFO: renamed from: getRoiHeight, reason: from getter */
    public final double getF13805f() {
        return this.f13805f;
    }

    public DocumentFormat(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        super(str, i);
        this.f13800a = d11;
        this.f13801b = d12;
        this.f13802c = d13;
        this.f13803d = d14;
        this.f13804e = d15;
        this.f13805f = d16;
        this.f13806g = d17;
    }

    public final int getRoiHeightInPx(int overlayHeight) {
        return (int) (((double) (overlayHeight - (getOverlayTopInPx(overlayHeight) * 2))) * this.f13805f);
    }

    public final int getRoiMarginBottomPx(int overlayHeight) {
        return (int) (((double) (overlayHeight - (getOverlayTopInPx(overlayHeight) * 2))) * this.f13806g);
    }
}
