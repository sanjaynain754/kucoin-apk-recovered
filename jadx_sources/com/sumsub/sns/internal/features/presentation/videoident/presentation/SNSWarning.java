package com.sumsub.sns.internal.features.presentation.videoident.presentation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSWarning;", "", "title", "", "text", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/CharSequence;", "getText", "setText", "(Ljava/lang/CharSequence;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SNSWarning {

    @Nullable
    private CharSequence text;

    @Nullable
    private final CharSequence title;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSWarning)) {
            return false;
        }
        SNSWarning sNSWarning = (SNSWarning) other;
        return Intrinsics.areEqual(this.title, sNSWarning.title) && Intrinsics.areEqual(this.text, sNSWarning.text);
    }

    public static /* synthetic */ SNSWarning copy$default(SNSWarning sNSWarning, CharSequence charSequence, CharSequence charSequence2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = sNSWarning.title;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = sNSWarning.text;
        }
        return sNSWarning.copy(charSequence, charSequence2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CharSequence getText() {
        return this.text;
    }

    @NotNull
    public final SNSWarning copy(@Nullable CharSequence title, @Nullable CharSequence text) {
        return new SNSWarning(title, text);
    }

    @Nullable
    public final CharSequence getText() {
        return this.text;
    }

    @Nullable
    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.text;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final void setText(@Nullable CharSequence charSequence) {
        this.text = charSequence;
    }

    @NotNull
    public String toString() {
        return "SNSWarning(title=" + ((Object) this.title) + ", text=" + ((Object) this.text) + ")";
    }

    public SNSWarning(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this.title = charSequence;
        this.text = charSequence2;
    }
}
