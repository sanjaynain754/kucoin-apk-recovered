package com.kubi.sdk.util;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.contract.ActivityResultContracts;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27054i0;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.util.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ImagePickerHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Deprecated(message = "请使用Android系统照片选择器")
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/util/ImagePickerHelper;", "", "<init>", "()V", "EXTRA_REQUEST_TYPE", "", "EXTRA_REQUEST_COUNT", "EXTRA_REQUEST_RESULT", "pickPhoto", "", "activity", "Lcom/kubi/sdk/BaseActivity;", BridgeParamKeyKt.MAX_COUNT, "", "requestCode", "mimeType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "goToSetting", "context", "Landroidx/fragment/app/FragmentActivity;", "message", "isFinish", "", "obtainResult", "", "Landroid/net/Uri;", "data", "Landroid/content/Intent;", "obtainPathResult", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImagePickerHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ImagePickerHelper f48151a = new ImagePickerHelper();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<Uri> m58393b(@Nullable Intent intent) {
        ArrayList parcelableArrayListExtra;
        return (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_REQUEST_RESULT")) == null) ? CollectionsKt.emptyList() : parcelableArrayListExtra;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m58394c(@NotNull BaseActivity activity, int i11, int i12, @NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType mimeType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent intent = new Intent(activity, (Class<?>) ImagePickerActivity.class);
        intent.putExtra("EXTRA_REQUEST_COUNT", i11);
        intent.putExtra("EXTRA_REQUEST_TYPE", VisualMediaTypeUtils.f48276a.m58534b(mimeType));
        activity.startActivityForResult(intent, i12);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m58395d(@NotNull BaseFragment fragment, int i11, int i12, @NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType mimeType) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intent intent = new Intent(fragment.getContext(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("EXTRA_REQUEST_COUNT", i11);
        intent.putExtra("EXTRA_REQUEST_TYPE", VisualMediaTypeUtils.f48276a.m58534b(mimeType));
        fragment.startActivityForResult(intent, i12);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m58396e(BaseActivity baseActivity, int i11, int i12, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
        }
        m58394c(baseActivity, i11, i12, visualMediaType);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m58397f(BaseFragment baseFragment, int i11, int i12, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE;
        }
        m58395d(baseFragment, i11, i12, visualMediaType);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m58392a(@Nullable Intent intent) {
        List<Uri> listM58393b = m58393b(intent);
        if (!listM58393b.isEmpty()) {
            return C27041f.m66668h(C27054i0.m66740d(BaseApplication.INSTANCE.get(), listM58393b.get(0), true));
        }
        return "";
    }
}
