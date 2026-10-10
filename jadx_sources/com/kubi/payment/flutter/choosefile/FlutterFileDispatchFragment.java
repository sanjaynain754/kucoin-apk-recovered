package com.kubi.payment.flutter.choosefile;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.R$string;
import com.kubi.payment.util.Utils;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.resources.dialog.LoadingDialogFragment;
import com.kubi.utils.C27054i0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.UUID;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.ByteStreamsKt;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import xb0.C46126b;

/* JADX INFO: compiled from: FlutterFileDispatchFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u001a\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001eH\u0002J\"\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0014\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010)\u001a\u00020\u0007H\u0016J\u0010\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0006J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/payment/flutter/choosefile/FlutterFileDispatchFragment;", "Lcom/kubi/resources/dialog/LoadingDialogFragment;", "<init>", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function3;", "", "", "fileType", "mContext", "Landroid/content/Context;", "mediaLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "kotlin.jvm.PlatformType", "handleMediaResult", "uri", "Landroid/net/Uri;", "handleMediaResultDefault", "finishWithFailure", "message", "onAttach", "context", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "checkPermission", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "fileSize", "path", "copyUriToCache", "Ljava/io/File;", "onDestroy", "isVideo", "", "mimeType", "getMimeType", "resolver", "Landroid/content/ContentResolver;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterFileDispatchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterFileDispatchFragment.kt\ncom/kubi/payment/flutter/choosefile/FlutterFileDispatchFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,286:1\n1#2:287\n*E\n"})
public final class FlutterFileDispatchFragment extends LoadingDialogFragment {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f39487e0 = new Companion(null);

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Function3<? super String, ? super String, ? super String, Unit> f39488a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f39489b0 = "0";

    /* JADX INFO: renamed from: c0 */
    public Context f39490c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final ActivityResultLauncher<PickVisualMediaRequest> f39491d0;

    /* JADX INFO: compiled from: FlutterFileDispatchFragment.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J0\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00072 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00100\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/flutter/choosefile/FlutterFileDispatchFragment$Companion;", "", "<init>", "()V", "REQUEST_CODE_PDF", "", "TYPE_PICK_IMAGE_VIDEO", "", "TYPE_PICK_IMAGE", "TYPE_PICK_VIDEO", "TYPE_PICK_PDF", "MIME_TYPE_IMAGE", "MIME_TYPE_VIDEO", "MIME_TYPE_PDF", "PICKER_CACHE_DIRECTORY", "clearPickerCache", "", "context", "Landroid/content/Context;", "clearBeforeTimestamp", "", "clearPickerCache$PaymentLib_googleRelease", "chooseFile", "type", "pathListener", "Lkotlin/Function3;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFlutterFileDispatchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterFileDispatchFragment.kt\ncom/kubi/payment/flutter/choosefile/FlutterFileDispatchFragment$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n3829#2:287\n4344#2,2:288\n1869#3,2:290\n*S KotlinDebug\n*F\n+ 1 FlutterFileDispatchFragment.kt\ncom/kubi/payment/flutter/choosefile/FlutterFileDispatchFragment$Companion\n*L\n72#1:287\n72#1:288,2\n75#1:290,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void chooseFile(@NotNull String type, @NotNull Function3<? super String, ? super String, ? super String, Unit> pathListener) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(pathListener, "pathListener");
            Activity activityM42511g = MviExKt.m42511g();
            FragmentActivity fragmentActivity = activityM42511g instanceof FragmentActivity ? (FragmentActivity) activityM42511g : null;
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                return;
            }
            FlutterFileDispatchFragment flutterFileDispatchFragment = new FlutterFileDispatchFragment();
            flutterFileDispatchFragment.f39489b0 = type;
            flutterFileDispatchFragment.f39488a0 = pathListener;
            flutterFileDispatchFragment.show(supportFragmentManager, "chooseFile");
        }

        public final void clearPickerCache$PaymentLib_googleRelease(@NotNull Context context, long clearBeforeTimestamp) {
            Object objM103844constructorimpl;
            ArrayList<File> arrayList;
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Result.Companion companion = Result.INSTANCE;
                File[] fileArrListFiles = new File(context.getCacheDir(), "payment_picker").listFiles();
                if (fileArrListFiles != null) {
                    arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        if (file.lastModified() <= clearBeforeTimestamp) {
                            arrayList.add(file);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNull(file2);
                        FilesKt.deleteRecursively(file2);
                    }
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97259c("FlutterFileDispatchFragment", "clearPickerCache failed: " + thM103847exceptionOrNullimpl.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m48213V3(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return StringsKt.startsWith$default(str, "video", false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: J3 */
    private final void m48194J3(final Function0<Unit> function0) {
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.payment.flutter.choosefile.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterFileDispatchFragment.m48195K3(function0, this, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.payment.flutter.choosefile.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterFileDispatchFragment.m48196L3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.payment.flutter.choosefile.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FlutterFileDispatchFragment.m48197M3(this.f39508b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.payment.flutter.choosefile.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FlutterFileDispatchFragment.m48198N3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF43550U());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q3 */
    public static final Unit m48199Q3(Ref.ObjectRef objectRef, String str) {
        objectRef.element = str != null ? String.valueOf(new File(str).length()) : 0;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m48201X3(FlutterFileDispatchFragment flutterFileDispatchFragment) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType(ConstantsKt.MIME_TYPE_PDF);
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            flutterFileDispatchFragment.startActivityForResult(intent, 2);
        } catch (Exception unused) {
            ToastCompat.m66437C(R$string.system_error);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public final File m48207O3(Uri uri) {
        Object objM103844constructorimpl;
        String string;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context context = this.f39490c0;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                    string = (columnIndex < 0 || !cursorQuery.moveToFirst()) ? null : cursorQuery.getString(columnIndex);
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            } else {
                string = null;
            }
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
            if (string == null) {
                string = "";
            }
            String name = new File(string).getName();
            if (StringsKt.isBlank(name)) {
                name = "picked_file";
            }
            if (StringsKt.isBlank(FilesKt.getExtension(new File(name))) && extensionFromMimeType != null && !StringsKt.isBlank(extensionFromMimeType)) {
                name = name + '.' + extensionFromMimeType;
            }
            Context context2 = this.f39490c0;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            File file = new File(context2.getCacheDir(), "payment_picker/" + UUID.randomUUID());
            file.mkdirs();
            File file2 = new File(file, name);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        ByteStreamsKt.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(fileOutputStream, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        CloseableKt.closeFinally(inputStreamOpenInputStream, th6);
                        throw th7;
                    }
                }
            } else {
                file2 = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(file2);
        } catch (Throwable th8) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th8));
        }
        return (File) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final String m48208P3(final String str) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (C27041f.m66668h(str).length() == 0) {
            objectRef.element = null;
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.payment.flutter.choosefile.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FlutterFileDispatchFragment.m48199Q3(objectRef, str);
            }
        });
        return (String) objectRef.element;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m48209R3(String str) {
        C44128b.m97259c("FlutterFileDispatchFragment", str);
        Function3<? super String, ? super String, ? super String, Unit> function3 = this.f39488a0;
        if (function3 != null) {
            function3.invoke("", "", null);
        }
        dismiss();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: T3 */
    public final void m48211T3(@Nullable Uri uri) {
        if (uri == null) {
            m48209R3("uri is null");
        } else {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FlutterFileDispatchFragment$handleMediaResult$1(this, uri, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final void m48212U3(Uri uri) {
        ContentResolver contentResolver;
        Context context = this.f39490c0;
        String str = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        String strM66740d = C27054i0.m66740d(context, uri, true);
        if (strM66740d == null || strM66740d.length() == 0) {
            dismiss();
            return;
        }
        Context context2 = getContext();
        if (context2 != null && (contentResolver = context2.getContentResolver()) != null) {
            str = m48213V3(m48210S3(contentResolver, uri)) ? "video" : "image";
        }
        String strM66668h = C27041f.m66668h(str);
        String strM48208P3 = m48208P3(strM66740d);
        Function3<? super String, ? super String, ? super String, Unit> function3 = this.f39488a0;
        if (function3 != null) {
            function3.invoke(strM66740d, strM66668h, strM48208P3);
        }
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.f39490c0 = context;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.kubi.resources.dialog.LoadingDialogFragment, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String str = this.f39489b0;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    this.f39491d0.launch(PickVisualMediaRequestKt.PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE));
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    this.f39491d0.launch(PickVisualMediaRequestKt.PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE));
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    this.f39491d0.launch(PickVisualMediaRequestKt.PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VideoOnly.INSTANCE));
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    m48194J3(new Function0() { // from class: com.kubi.payment.flutter.choosefile.h
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FlutterFileDispatchFragment.m48201X3(this.f39503b);
                        }
                    });
                    break;
                }
                break;
        }
    }

    public FlutterFileDispatchFragment() {
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ActivityResultCallback() { // from class: com.kubi.payment.flutter.choosefile.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FlutterFileDispatchFragment.m48200W3(this.f39504a, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f39491d0 = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m48195K3(Function0 function0, FlutterFileDispatchFragment flutterFileDispatchFragment, Boolean bool) {
        if (bool.booleanValue()) {
            function0.invoke();
        } else {
            flutterFileDispatchFragment.dismiss();
            ToastCompat.m66437C(R$string.please_open_write_read_right);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final void m48196L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m48197M3(FlutterFileDispatchFragment flutterFileDispatchFragment, Throwable th2) {
        flutterFileDispatchFragment.dismiss();
        ToastCompat.m66437C(R$string.please_open_write_read_right);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final void m48198N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m48200W3(FlutterFileDispatchFragment flutterFileDispatchFragment, Uri uri) {
        flutterFileDispatchFragment.m48211T3(uri);
    }

    /* JADX INFO: renamed from: S3 */
    public final String m48210S3(ContentResolver contentResolver, Uri uri) {
        return C27041f.m66668h(contentResolver.getType(uri));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String strM66668h;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null) {
            if (requestCode == 2) {
                Uri data2 = data.getData();
                if (data2 == null) {
                    return;
                }
                Context context = getContext();
                if (context != null) {
                    strM66668h = C27041f.m66668h(Utils.f40393a.m49850b(context, data2));
                } else {
                    strM66668h = null;
                }
                String strM66668h2 = C27041f.m66668h(strM66668h);
                Function3<? super String, ? super String, ? super String, Unit> function3 = this.f39488a0;
                if (function3 != null) {
                    String string = data2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    function3.invoke(string, "pdf", m48208P3(strM66668h2));
                }
            }
            dismiss();
            return;
        }
        dismiss();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f39488a0 = null;
    }
}
