package com.kubi.sdk.util;

import androidx.activity.result.contract.ActivityResultContracts;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.t1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ImagePickerHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/util/VisualMediaTypeUtils;", "", "<init>", "()V", "toValue", "", "type", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "toValue$LBase_googleRelease", "fromValue", "value", "fromValue$LBase_googleRelease", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class VisualMediaTypeUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final VisualMediaTypeUtils f48276a = new VisualMediaTypeUtils();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType m58533a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode != -958197081) {
            if (iHashCode != 1125660551) {
                if (iHashCode == 1205857087 && value.equals("ImageAndVideo")) {
                    return ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
                }
            } else if (value.equals("ImageOnly")) {
                return ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
            }
        } else if (value.equals("VideoOnly")) {
            return ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE;
        }
        return new ActivityResultContracts.PickVisualMedia.SingleMimeType(value);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m58534b(@NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof ActivityResultContracts.PickVisualMedia.ImageOnly) {
            return "ImageOnly";
        }
        if (type instanceof ActivityResultContracts.PickVisualMedia.VideoOnly) {
            return "VideoOnly";
        }
        if (type instanceof ActivityResultContracts.PickVisualMedia.ImageAndVideo) {
            return "ImageAndVideo";
        }
        if (type instanceof ActivityResultContracts.PickVisualMedia.SingleMimeType) {
            return ((ActivityResultContracts.PickVisualMedia.SingleMimeType) type).getMimeType();
        }
        throw new NoWhenBranchMatchedException();
    }
}
