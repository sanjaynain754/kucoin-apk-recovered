package com.sumsub.sns.internal.core.presentation.common;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.LifecycleOwnerKt;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.NavigationAction;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.C28449e;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.documents.C30148s;
import com.sumsub.sns.internal.features.presentation.camera.AbstractC30348K;
import java.io.File;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28769e extends AbstractC28787t {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty[] f58517i = {AbstractC28639a.m69485a(C28769e.class, "pendingRequest", "getPendingRequest()Lcom/sumsub/sns/internal/features/domain/documents/GalleryRequest;", 0)};

    /* JADX INFO: renamed from: e */
    public final Function1 f58518e;

    /* JADX INFO: renamed from: f */
    public final String f58519f;

    /* JADX INFO: renamed from: g */
    public final C28780m f58520g;

    /* JADX INFO: renamed from: h */
    public ActivityResultLauncher f58521h;

    public C28769e(AbstractC30348K abstractC30348K, Function1 function1) {
        super(abstractC30348K, null);
        this.f58519f = "GalleryPicker";
        this.f58520g = new C28780m("PENDING_GALLERY_REQUEST", C30148s.class);
        this.f58518e = function1;
    }

    /* JADX INFO: renamed from: a */
    public static final void m69590a(C28769e c28769e, Uri uri) {
        C28780m c28780m = c28769e.f58520g;
        KProperty[] kPropertyArr = f58517i;
        KProperty kProperty = kPropertyArr[0];
        c28780m.getClass();
        Bundle arguments = c28769e.f58549a.getArguments();
        C30148s c30148s = (C30148s) (arguments != null ? AbstractC28437b.m69320a(arguments, c28769e.m69603a(c28780m.f58534a), c28780m.f58535b, c28769e.f58549a.requireContext()) : null);
        if (c30148s == null) {
            return;
        }
        C28780m c28780m2 = c28769e.f58520g;
        KProperty kProperty2 = kPropertyArr[0];
        String strM69603a = c28769e.m69603a(c28780m2.f58534a);
        Bundle arguments2 = c28769e.f58549a.getArguments();
        if (arguments2 != null) {
            arguments2.remove(strM69603a);
        }
        if (uri == null) {
            return;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(c28769e.f58549a.getViewLifecycleOwner()), null, null, new C28765c(c28769e, uri, c30148s, null), 3, null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f58519f;
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: l */
    public final void mo69495l() {
        this.f58521h = this.f58549a.requireActivity().getActivityResultRegistry().register(m69603a("GALLERY_PICKER"), this.f58549a.getViewLifecycleOwner(), new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: com.sumsub.sns.internal.core.presentation.common.b0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C28769e.m69590a(this.f58506a, (Uri) obj);
            }
        });
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public final void mo69522m() {
        ActivityResultLauncher activityResultLauncher = this.f58521h;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.f58521h = null;
    }

    public C28769e(AbstractC28787t abstractC28787t, Function1 function1) {
        super(abstractC28787t.f58549a, abstractC28787t);
        this.f58519f = "GalleryPicker";
        this.f58520g = new C28780m("PENDING_GALLERY_REQUEST", C30148s.class);
        this.f58518e = function1;
    }

    /* JADX INFO: renamed from: a */
    public final void m69592a(C30148s c30148s) {
        Screen screen;
        C28780m c28780m = this.f58520g;
        KProperty kProperty = f58517i[0];
        String strM69603a = m69603a(c28780m.f58534a);
        Bundle arguments = this.f58549a.getArguments();
        if (arguments != null) {
            arguments.putParcelable(strM69603a, c30148s);
        }
        String[] strArr = c30148s.f60586c;
        int length = strArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                screen = Screen.SystemImagePicker;
                break;
            } else {
                if (!StringsKt.contains$default((CharSequence) strArr[i11], (CharSequence) "image", false, 2, (Object) null)) {
                    screen = Screen.SystemDocumentPicker;
                    break;
                }
                i11++;
            }
        }
        ActivityResultLauncher activityResultLauncher = this.f58521h;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(strArr);
            C28368g c28368gM69265a = new C28368g().m69265a(screen, c30148s.f60584a.f59014a, null);
            c28368gM69265a.f57846b.add(NavigationAction.Opened);
            c28368gM69265a.f57847c = MapsKt.emptyMap();
            c28368gM69265a.m69267a(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m69591a(Context context, Uri uri, String str, ContinuationImpl continuationImpl) {
        C28767d c28767d;
        String str2;
        Object objM91049g;
        String encodedPath;
        String str3;
        String str4;
        if (continuationImpl instanceof C28767d) {
            c28767d = (C28767d) continuationImpl;
            int i11 = c28767d.f58515d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28767d.f58515d = i11 - Integer.MIN_VALUE;
            } else {
                c28767d = new C28767d(this, continuationImpl);
            }
        } else {
            c28767d = new C28767d(this, continuationImpl);
        }
        Object obj = c28767d.f58513b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28767d.f58515d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            String scheme = uri.getScheme();
            if (scheme != null && StringsKt.startsWith$default(scheme, "file", false, 2, (Object) null)) {
                encodedPath = uri.getEncodedPath();
                str3 = str;
            } else {
                str2 = str;
                c28767d.f58512a = str2;
                c28767d.f58515d = 1;
                objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28449e(context, uri, null), c28767d);
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (encodedPath != null) {
                if (encodedPath.length() > 0) {
                    str4 = encodedPath;
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    File file = new File(StringsKt.replace$default(str4, "file://", "", false, 4, (Object) null));
                    return new C29054T(file, file, str3, null, null, null, null, 736);
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str5 = c28767d.f58512a;
        ResultKt.throwOnFailure(obj);
        objM91049g = obj;
        str2 = str5;
        str3 = str2;
        encodedPath = (String) objM91049g;
        if (encodedPath != null) {
            if (encodedPath.length() > 0) {
                str4 = encodedPath;
            } else {
                str4 = null;
            }
            if (str4 != null) {
                File file2 = new File(StringsKt.replace$default(str4, "file://", "", false, 4, (Object) null));
                return new C29054T(file2, file2, str3, null, null, null, null, 736);
            }
        }
        return null;
    }
}
