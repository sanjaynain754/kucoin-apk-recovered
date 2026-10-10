package com.kubi.sdk.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.kubi.sdk.exception.AppBaseException;
import com.kubi.utils.C27100x0;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImagePickerHelper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J \u0010\b\u001a\u00020\u00052\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/util/ImagePickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handlePhotoResult", "uris", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImagePickerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickerHelper.kt\ncom/kubi/sdk/util/ImagePickerActivity\n+ 2 AppBaseIssue.kt\ncom/kubi/sdk/exception/AppBaseIssueKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n45#2,2:175\n1869#3,2:177\n1#4:179\n*S KotlinDebug\n*F\n+ 1 ImagePickerHelper.kt\ncom/kubi/sdk/util/ImagePickerActivity\n*L\n134#1:175,2\n140#1:177,2\n*E\n"})
public final class ImagePickerActivity extends AppCompatActivity {
    /* JADX INFO: renamed from: L */
    public static final void m58326L(ImagePickerActivity imagePickerActivity, List list) {
        ArrayList<Uri> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        imagePickerActivity.m58328J(arrayList);
    }

    /* JADX INFO: renamed from: M */
    public static final void m58327M(ImagePickerActivity imagePickerActivity, Uri uri) {
        if (uri == null) {
            imagePickerActivity.m58328J(new ArrayList<>());
        } else {
            imagePickerActivity.m58328J(CollectionsKt.arrayListOf(uri));
        }
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m58325K(ImagePickerActivity imagePickerActivity, Uri uri) {
        imagePickerActivity.getContentResolver().takePersistableUriPermission(uri, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public final void m58328J(ArrayList<Uri> arrayList) {
        int i11;
        for (final Uri uri : arrayList) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.sdk.util.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImagePickerActivity.m58325K(this.f48148b, uri);
                }
            });
        }
        if (arrayList.isEmpty()) {
            i11 = 0;
        } else {
            i11 = -1;
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("EXTRA_REQUEST_RESULT", arrayList);
        Unit unit = Unit.INSTANCE;
        setResult(i11, intent);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Object objM103844constructorimpl;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            VisualMediaTypeUtils visualMediaTypeUtils = VisualMediaTypeUtils.f48276a;
            String stringExtra = getIntent().getStringExtra("EXTRA_REQUEST_TYPE");
            if (stringExtra == null) {
                stringExtra = visualMediaTypeUtils.m58534b(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE);
            }
            ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaTypeM58533a = visualMediaTypeUtils.m58533a(stringExtra);
            int intExtra = getIntent().getIntExtra("EXTRA_REQUEST_COUNT", 1);
            if (intExtra > 1) {
                registerForActivityResult(new ActivityResultContracts.PickMultipleVisualMedia(intExtra), new ActivityResultCallback() { // from class: com.kubi.sdk.util.z
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        ImagePickerActivity.m58326L(this.f48278a, (List) obj);
                    }
                }).launch(PickVisualMediaRequestKt.PickVisualMediaRequest(visualMediaTypeM58533a));
            } else {
                registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: com.kubi.sdk.util.a0
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        ImagePickerActivity.m58327M(this.f48143a, (Uri) obj);
                    }
                }).launch(PickVisualMediaRequestKt.PickVisualMediaRequest(visualMediaTypeM58533a));
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AppBaseException(thM103847exceptionOrNullimpl, "ImagePickerActivity", false, null, 8, null), null, 2, null);
        }
    }
}
