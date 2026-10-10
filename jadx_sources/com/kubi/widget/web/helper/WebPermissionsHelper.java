package com.kubi.widget.web.helper;

import android.content.DialogInterface;
import android.webkit.PermissionRequest;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.widget.web.R$string;
import com.kubi.widget.web.exception.KWebWidgetMessage;
import e10.InterfaceC37043b;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w80.C45757b;
import xb0.C46126b;

/* JADX INFO: renamed from: com.kubi.widget.web.helper.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WebPermissionsHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002J\u001e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/widget/web/helper/WebPermissionsHelper;", "Lcom/kubi/sdk/web/spi/IKWebPermission;", "activity", "Lcom/kubi/sdk/BaseActivity;", "preRequestPermissions", "", "<init>", "(Lcom/kubi/sdk/BaseActivity;Z)V", "rxPermissions", "Lcom/tbruyelle/rxpermissions2/RxPermissions;", "mutableMap", "", "", "Lkotlin/Pair;", "TAG", "onPermissionRequest", "", "request", "Landroid/webkit/PermissionRequest;", "getGrantedPers", "", "host", "storeHostPermission", "grantedPers", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebPermissionsHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebPermissionsHelper.kt\ncom/kubi/widget/web/helper/WebPermissionsHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n*L\n1#1,160:1\n1563#2:161\n1634#2,3:162\n774#2:165\n865#2,2:166\n37#3:168\n36#3,3:169\n54#4,2:172\n54#4,2:174\n*S KotlinDebug\n*F\n+ 1 WebPermissionsHelper.kt\ncom/kubi/widget/web/helper/WebPermissionsHelper\n*L\n41#1:161\n41#1:162,3\n41#1:165\n41#1:166,2\n49#1:168\n49#1:169,3\n62#1:172,2\n71#1:174,2\n*E\n"})
public final class WebPermissionsHelper implements InterfaceC37043b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseActivity f55164a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C46126b f55165b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<String, Pair<String, String>> f55166c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f55167d;

    public WebPermissionsHelper(@NotNull BaseActivity activity, boolean z11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55164a = activity;
        this.f55165b = new C46126b(activity);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f55166c = linkedHashMap;
        this.f55167d = "webPermission";
        int i11 = R$string.web_permission_title;
        linkedHashMap.put("android.webkit.resource.VIDEO_CAPTURE", new Pair("android.permission.CAMERA", activity.getString(i11)));
        linkedHashMap.put("android.webkit.resource.AUDIO_CAPTURE", new Pair("android.permission.RECORD_AUDIO", activity.getString(i11)));
        if (z11) {
            Collection collectionValues = linkedHashMap.values();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Pair) it.next()).getFirst());
            }
            List listDistinct = CollectionsKt.distinct(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listDistinct) {
                if (ContextCompat.checkSelfPermission(this.f55164a, (String) obj) != 0) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            C44128b.m97259c(this.f55167d, "preRequestPermissions: requesting " + arrayList2);
            try {
                this.f55164a.registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.kubi.widget.web.helper.a0
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj2) {
                        WebPermissionsHelper.m67306i(this.f55162a, (Map) obj2);
                    }
                }).launch(arrayList2.toArray(new String[0]));
            } catch (Exception e11) {
                C44128b.m97261e(this.f55167d, "preRequestPermissions launch error: " + e11.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m67306i(WebPermissionsHelper webPermissionsHelper, Map map) {
        C44128b.m97259c(webPermissionsHelper.f55167d, "preRequestPermissions result: " + map);
    }

    /* JADX INFO: renamed from: l */
    public static final void m67308l(WebPermissionsHelper webPermissionsHelper, String str, String str2, List list, PermissionRequest permissionRequest, DialogInterface dialogInterface, int i11) {
        C44128b.m97259c(webPermissionsHelper.f55167d, "onPermissionRequest granted from custom dialog: " + str + ", resource: " + str2);
        Intrinsics.checkNotNull(str2);
        list.add(str2);
        webPermissionsHelper.m67317s(str, list);
        m67314r(webPermissionsHelper, permissionRequest, new String[]{str2});
    }

    /* JADX INFO: renamed from: m */
    public static final void m67309m(WebPermissionsHelper webPermissionsHelper, String str, String str2, PermissionRequest permissionRequest, DialogInterface dialogInterface, int i11) {
        C44128b.m97259c(webPermissionsHelper.f55167d, "onPermissionRequest deny from custom dialog: " + str + ", resource: " + str2);
        m67313q(webPermissionsHelper, permissionRequest);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m67312p(WebPermissionsHelper webPermissionsHelper, String str, String str2, PermissionRequest permissionRequest, Throwable th2) {
        C44128b.m97261e(webPermissionsHelper.f55167d, "onPermissionRequest error: " + str + ", resource: " + str2 + ", error: " + th2.getMessage());
        m67313q(webPermissionsHelper, permissionRequest);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m67313q(WebPermissionsHelper webPermissionsHelper, PermissionRequest permissionRequest) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            permissionRequest.deny();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43840a.m96550d(webPermissionsHelper.f55167d, "onPermissionRequest deny failed: " + thM103847exceptionOrNullimpl.getMessage());
            C43846g.m96568c(new KWebWidgetMessage("deny failed: " + thM103847exceptionOrNullimpl.getMessage(), webPermissionsHelper.f55167d, false, 4, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m67314r(WebPermissionsHelper webPermissionsHelper, PermissionRequest permissionRequest, String[] strArr) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            permissionRequest.grant(strArr);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43840a.m96550d(webPermissionsHelper.f55167d, "onPermissionRequest grant failed: " + thM103847exceptionOrNullimpl.getMessage());
            C43846g.m96568c(new KWebWidgetMessage("grant failed: " + thM103847exceptionOrNullimpl.getMessage() + ", resources:" + ArraysKt.toList(strArr), webPermissionsHelper.f55167d, false, 4, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m67316j(String str) {
        String strM101020b = C45757b.m101020b(C45757b.f103175a, str, null, 2, null);
        return (strM101020b == null || StringsKt.isBlank(strM101020b)) ? new ArrayList() : CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) strM101020b, new String[]{","}, false, 0, 6, (Object) null));
    }

    /* JADX INFO: renamed from: k */
    public static final void m67307k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m67310n(WebPermissionsHelper webPermissionsHelper, String str, String str2, List list, PermissionRequest permissionRequest, Boolean bool) {
        if (bool.booleanValue()) {
            C44128b.m97259c(webPermissionsHelper.f55167d, "onPermissionRequest granted from system: " + str + ", resource: " + str2);
            Intrinsics.checkNotNull(str2);
            list.add(str2);
            webPermissionsHelper.m67317s(str, list);
            m67314r(webPermissionsHelper, permissionRequest, new String[]{str2});
        } else {
            C44128b.m97259c(webPermissionsHelper.f55167d, "onPermissionRequest deny from system: " + str + ", resource: " + str2);
            list.remove(str2);
            webPermissionsHelper.m67317s(str, list);
            m67313q(webPermissionsHelper, permissionRequest);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m67311o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // e10.InterfaceC37043b
    /* JADX INFO: renamed from: a */
    public void mo67315a(@NotNull final PermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final String host = request.getOrigin().getHost();
        if (host != null && !StringsKt.isBlank(host)) {
            final List<String> listM67316j = m67316j(host);
            Iterator it = ArrayIteratorKt.iterator(request.getResources());
            while (it.hasNext()) {
                final String str = (String) it.next();
                C44128b.m97259c(this.f55167d, "onPermissionRequest: " + host + ", resource: " + str);
                Pair<String, String> pair = this.f55166c.get(str);
                if (pair != null) {
                    if (!this.f55165b.m101649h(pair.getFirst())) {
                        Observable<Boolean> observableM101655n = this.f55165b.m101655n(pair.getFirst());
                        final PermissionRequest permissionRequest = request;
                        final Function1 function1 = new Function1() { // from class: com.kubi.widget.web.helper.u
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WebPermissionsHelper.m67310n(this.f55188b, host, str, listM67316j, permissionRequest, (Boolean) obj);
                            }
                        };
                        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.widget.web.helper.v
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                WebPermissionsHelper.m67311o(function1, obj);
                            }
                        };
                        final Function1 function2 = new Function1() { // from class: com.kubi.widget.web.helper.w
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WebPermissionsHelper.m67312p(this.f55194b, host, str, request, (Throwable) obj);
                            }
                        };
                        Disposable disposableSubscribe = observableM101655n.subscribe(consumer, new Consumer() { // from class: com.kubi.widget.web.helper.x
                            @Override // io.reactivex.functions.Consumer
                            public final void accept(Object obj) {
                                WebPermissionsHelper.m67307k(function2, obj);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
                        DisposableKt.addTo(disposableSubscribe, this.f55164a.getDestroyDisposable());
                    } else if (listM67316j.contains(str)) {
                        C44128b.m97259c(this.f55167d, "onPermissionRequest had granted before: " + host + ", resource: " + str);
                        Intrinsics.checkNotNull(str);
                        m67314r(this, request, new String[]{str});
                    } else {
                        final PermissionRequest permissionRequest2 = request;
                        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54156M4(pair.getSecond()).m54157N4(true).m54151H4(false).m54161R4(0).m54162S4(R$string.web_permission_ok, new DialogInterface.OnClickListener() { // from class: com.kubi.widget.web.helper.y
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                WebPermissionsHelper.m67308l(this.f55199b, host, str, listM67316j, permissionRequest2, dialogInterface, i11);
                            }
                        }).m54159P4(R$string.web_permission_denied, new DialogInterface.OnClickListener() { // from class: com.kubi.widget.web.helper.z
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                WebPermissionsHelper.m67309m(this.f55204b, host, str, permissionRequest2, dialogInterface, i11);
                            }
                        }).m54172c5(this.f55164a.getSupportFragmentManager());
                        request = permissionRequest2;
                    }
                }
            }
            return;
        }
        String str2 = this.f55167d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onPermissionRequest host is null:");
        sb2.append(request.getOrigin().getHost());
        sb2.append(", request.resources: ");
        String[] resources = request.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        sb2.append(ArraysKt.toMutableList(resources));
        sb2.append(' ');
        C44128b.m97261e(str2, sb2.toString());
        m67313q(this, request);
    }

    /* JADX INFO: renamed from: s */
    public final void m67317s(String str, List<String> list) {
        if (list.isEmpty()) {
            C45757b.f103175a.m101023d(str);
        } else {
            C45757b.f103175a.m101022c(str, CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
    }

    public /* synthetic */ WebPermissionsHelper(BaseActivity baseActivity, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, (i11 & 2) != 0 ? false : z11);
    }
}
