package com.kubi.sdk.pkg.bundle.i18n;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnI18nModels.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;", "", "notModified", "", TtmlNode.TAG_BODY, "", "validator", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;", "(ZLjava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;)V", "getBody", "()Ljava/lang/String;", "getNotModified", "()Z", "getValidator", "()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class RnI18nHttpResult {

    @Nullable
    private final String body;
    private final boolean notModified;

    @NotNull
    private final RnI18nHttpValidator validator;

    public RnI18nHttpResult(boolean z11, @Nullable String str, @NotNull RnI18nHttpValidator validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.notModified = z11;
        this.body = str;
        this.validator = validator;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RnI18nHttpResult)) {
            return false;
        }
        RnI18nHttpResult rnI18nHttpResult = (RnI18nHttpResult) other;
        return this.notModified == rnI18nHttpResult.notModified && Intrinsics.areEqual(this.body, rnI18nHttpResult.body) && Intrinsics.areEqual(this.validator, rnI18nHttpResult.validator);
    }

    public static /* synthetic */ RnI18nHttpResult copy$default(RnI18nHttpResult rnI18nHttpResult, boolean z11, String str, RnI18nHttpValidator rnI18nHttpValidator, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = rnI18nHttpResult.notModified;
        }
        if ((i11 & 2) != 0) {
            str = rnI18nHttpResult.body;
        }
        if ((i11 & 4) != 0) {
            rnI18nHttpValidator = rnI18nHttpResult.validator;
        }
        return rnI18nHttpResult.copy(z11, str, rnI18nHttpValidator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNotModified() {
        return this.notModified;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RnI18nHttpValidator getValidator() {
        return this.validator;
    }

    @NotNull
    public final RnI18nHttpResult copy(boolean notModified, @Nullable String body, @NotNull RnI18nHttpValidator validator) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        return new RnI18nHttpResult(notModified, body, validator);
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    public final boolean getNotModified() {
        return this.notModified;
    }

    @NotNull
    public final RnI18nHttpValidator getValidator() {
        return this.validator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.notModified;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        String str = this.body;
        return ((i11 + (str == null ? 0 : str.hashCode())) * 31) + this.validator.hashCode();
    }

    @NotNull
    public String toString() {
        return "RnI18nHttpResult(notModified=" + this.notModified + ", body=" + this.body + ", validator=" + this.validator + ')';
    }

    public /* synthetic */ RnI18nHttpResult(boolean z11, String str, RnI18nHttpValidator rnI18nHttpValidator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? new RnI18nHttpValidator(null, null, 3, null) : rnI18nHttpValidator);
    }
}
