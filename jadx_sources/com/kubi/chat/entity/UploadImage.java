package com.kubi.chat.entity;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/chat/entity/UploadImage;", "", TypedValues.Custom.S_BOOLEAN, "", "imgUrl", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getBoolean", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImgUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/chat/entity/UploadImage;", "equals", "other", "hashCode", "", "toString", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class UploadImage {

    @Nullable
    private final Boolean boolean;

    @Nullable
    private final String imgUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadImage)) {
            return false;
        }
        UploadImage uploadImage = (UploadImage) other;
        return Intrinsics.areEqual(this.boolean, uploadImage.boolean) && Intrinsics.areEqual(this.imgUrl, uploadImage.imgUrl);
    }

    public static /* synthetic */ UploadImage copy$default(UploadImage uploadImage, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = uploadImage.boolean;
        }
        if ((i11 & 2) != 0) {
            str = uploadImage.imgUrl;
        }
        return uploadImage.copy(bool, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getBoolean() {
        return this.boolean;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final UploadImage copy(@Nullable Boolean bool, @Nullable String imgUrl) {
        return new UploadImage(bool, imgUrl);
    }

    @Nullable
    public final Boolean getBoolean() {
        return this.boolean;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public int hashCode() {
        Boolean bool = this.boolean;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.imgUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UploadImage(boolean=" + this.boolean + ", imgUrl=" + ((Object) this.imgUrl) + ')';
    }

    public UploadImage(@Nullable Boolean bool, @Nullable String str) {
        this.boolean = bool;
        this.imgUrl = str;
    }
}
