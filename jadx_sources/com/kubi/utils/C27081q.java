package com.kubi.utils;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.q */
/* JADX INFO: compiled from: DslSpannable.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010+\u001a\u0004\b\u001c\u0010,\"\u0004\b-\u0010.¨\u00060"}, m90084d2 = {"Lcom/kubi/utils/q;", "Lcom/kubi/utils/p;", "<init>", "()V", "", "color", "", "b", "(I)V", "Landroid/view/View$OnClickListener;", "onClick", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILandroid/view/View$OnClickListener;)V", "Landroid/text/style/ForegroundColorSpan;", "Landroid/text/style/ForegroundColorSpan;", "d", "()Landroid/text/style/ForegroundColorSpan;", "setForegroundColorSpan", "(Landroid/text/style/ForegroundColorSpan;)V", "foregroundColorSpan", "Lcom/kubi/utils/c0;", "Lcom/kubi/utils/c0;", "e", "()Lcom/kubi/utils/c0;", "setOnClickSpan", "(Lcom/kubi/utils/c0;)V", "onClickSpan", "Landroid/text/style/StyleSpan;", "c", "Landroid/text/style/StyleSpan;", "f", "()Landroid/text/style/StyleSpan;", "setStyleSpan", "(Landroid/text/style/StyleSpan;)V", "styleSpan", "Landroid/text/style/UnderlineSpan;", "Landroid/text/style/UnderlineSpan;", "g", "()Landroid/text/style/UnderlineSpan;", "setUnderlineSpan", "(Landroid/text/style/UnderlineSpan;)V", "underlineSpan", "Landroid/text/style/AbsoluteSizeSpan;", "Landroid/text/style/AbsoluteSizeSpan;", "()Landroid/text/style/AbsoluteSizeSpan;", "setAbsoluteSizeSpan", "(Landroid/text/style/AbsoluteSizeSpan;)V", "absoluteSizeSpan", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27081q implements InterfaceC27079p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ForegroundColorSpan foregroundColorSpan;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C27018c0 onClickSpan;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public StyleSpan styleSpan;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public UnderlineSpan underlineSpan;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public AbsoluteSizeSpan absoluteSizeSpan;

    @Override // com.kubi.utils.InterfaceC27079p
    /* JADX INFO: renamed from: a */
    public void mo66822a(int color, @NotNull View.OnClickListener onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClickSpan = new C27018c0(color, onClick);
    }

    @Override // com.kubi.utils.InterfaceC27079p
    /* JADX INFO: renamed from: b */
    public void mo66823b(int color) {
        this.foregroundColorSpan = new ForegroundColorSpan(color);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbsoluteSizeSpan getAbsoluteSizeSpan() {
        return this.absoluteSizeSpan;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ForegroundColorSpan getForegroundColorSpan() {
        return this.foregroundColorSpan;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27018c0 getOnClickSpan() {
        return this.onClickSpan;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final StyleSpan getStyleSpan() {
        return this.styleSpan;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final UnderlineSpan getUnderlineSpan() {
        return this.underlineSpan;
    }
}
