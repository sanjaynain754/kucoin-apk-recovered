package com.kubi.p110rn.p111ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.Constants;
import com.kubi.p110rn.C23207R;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.chad.library.adapter.base.BaseViewHolder;
import java.net.URLEncoder;
import java.util.Set;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RnDialogHelper.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005Jh\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eJV\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00052:\u0010!\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0015\u0012\u0013\u0018\u00010&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u001f0\"2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)J\u0016\u0010*\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0011J\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0005J\u0010\u0010-\u001a\u00020.2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\u00020.2\u0006\u00100\u001a\u000201H\u0002JF\u00102\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\u00103\u001a\u0004\u0018\u00010\u0019H\u0002J4\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0011H\u0002J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u000207H\u0002J\u0010\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020<H\u0002J \u0010=\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u00105\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Lcom/kubi/rn/ui/RnDialogHelper;", "", "<init>", "()V", "TAG", "", "KEY_BIZ", "KEY_ENTRY", "KEY_COMPONENT", "VIEW_HEIGHT", "KEY_BACKUP", "KEY_ROUTE", "KEY_DIALOG_ID", "KEY_IGNORE_BACK", "lastDialogId", "getLastSubmitData", "openRnDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "biz", RnDialogHelper.KEY_ENTRY, "component", "viewHeight", "", RnDialogHelper.KEY_BACKUP, ReportDataTable.COLUMN_PARAMS, "Landroid/os/Bundle;", RnDialogHelper.KEY_IGNORE_BACK, "", RnDialogHelper.KEY_DIALOG_ID, "onDismiss", "Lkotlin/Function0;", "", RnDialogHelper.KEY_ROUTE, TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "data", "Lcom/kubi/rn/ui/KCBridgeRejecterError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "onDismissed", "Lcom/kubi/rn/ui/OnDialogDismissedListener;", "registerDialogId", "dialog", "unregisterDialogId", "parseRoute", "Lcom/kubi/rn/ui/RnDialogHelper$RouteInfo;", "parseKrnRouteFromUri", "uri", "Landroid/net/Uri;", "buildFragmentArgs", "customParams", "createDialog", "fragmentArgs", "setupBottomSheetBehavior", "Landroid/widget/FrameLayout;", "setupRnContainerTouchInterceptor", "bottomSheet", "setupRoundedCorners", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "attachReactFragment", "RouteInfo", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnDialogHelper.kt\ncom/kubi/rn/ui/RnDialogHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n1#2:406\n29#3:407\n1869#4,2:408\n*S KotlinDebug\n*F\n+ 1 RnDialogHelper.kt\ncom/kubi/rn/ui/RnDialogHelper\n*L\n175#1:407\n200#1:408,2\n*E\n"})
public final class RnDialogHelper {

    @NotNull
    public static final RnDialogHelper INSTANCE = new RnDialogHelper();

    @NotNull
    private static final String KEY_BACKUP = "backup";

    @NotNull
    private static final String KEY_BIZ = "biz";

    @NotNull
    private static final String KEY_COMPONENT = "component";

    @NotNull
    private static final String KEY_DIALOG_ID = "dialogId";

    @NotNull
    private static final String KEY_ENTRY = "entry";

    @NotNull
    private static final String KEY_IGNORE_BACK = "ignoreHandleBackPressed";

    @NotNull
    private static final String KEY_ROUTE = "route";

    @NotNull
    private static final String TAG = "RnDialogHelper";

    @NotNull
    private static final String VIEW_HEIGHT = "view_height";

    @Nullable
    private static volatile String lastDialogId;

    /* JADX INFO: renamed from: com.kubi.rn.ui.RnDialogHelper$a, reason: from toString */
    /* JADX INFO: compiled from: RnDialogHelper.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m90084d2 = {"Lcom/kubi/rn/ui/RnDialogHelper$RouteInfo;", "", "biz", "", RnDialogHelper.KEY_ENTRY, "component", "viewHeight", "", RnDialogHelper.KEY_BACKUP, "rnRoute", ReportDataTable.COLUMN_PARAMS, "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "getBiz", "()Ljava/lang/String;", "getEntry", "getComponent", "getViewHeight", "()I", "getBackup", "getRnRoute", "getParams", "()Landroid/os/Bundle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RouteInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String biz;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String entry;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final String component;

        /* JADX INFO: renamed from: d, reason: from toString */
        public final int viewHeight;

        /* JADX INFO: renamed from: e, reason: from toString */
        @Nullable
        public final String backup;

        /* JADX INFO: renamed from: f, reason: from toString */
        @Nullable
        public final String rnRoute;

        /* JADX INFO: renamed from: g, reason: from toString */
        @NotNull
        public final Bundle params;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteInfo)) {
                return false;
            }
            RouteInfo routeInfo = (RouteInfo) other;
            return Intrinsics.areEqual(this.biz, routeInfo.biz) && Intrinsics.areEqual(this.entry, routeInfo.entry) && Intrinsics.areEqual(this.component, routeInfo.component) && this.viewHeight == routeInfo.viewHeight && Intrinsics.areEqual(this.backup, routeInfo.backup) && Intrinsics.areEqual(this.rnRoute, routeInfo.rnRoute) && Intrinsics.areEqual(this.params, routeInfo.params);
        }

        public RouteInfo(@NotNull String biz, @NotNull String entry, @NotNull String component, int i11, @Nullable String str, @Nullable String str2, @NotNull Bundle params) {
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(component, "component");
            Intrinsics.checkNotNullParameter(params, "params");
            this.biz = biz;
            this.entry = entry;
            this.component = component;
            this.viewHeight = i11;
            this.backup = str;
            this.rnRoute = str2;
            this.params = params;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBackup() {
            return this.backup;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEntry() {
            return this.entry;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Bundle getParams() {
            return this.params;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getViewHeight() {
            return this.viewHeight;
        }

        public int hashCode() {
            int iHashCode = ((((((this.biz.hashCode() * 31) + this.entry.hashCode()) * 31) + this.component.hashCode()) * 31) + Integer.hashCode(this.viewHeight)) * 31;
            String str = this.backup;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rnRoute;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "RouteInfo(biz=" + this.biz + ", entry=" + this.entry + ", component=" + this.component + ", viewHeight=" + this.viewHeight + ", backup=" + this.backup + ", rnRoute=" + this.rnRoute + ", params=" + this.params + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogFragmentHelper openRnDialog$default(RnDialogHelper rnDialogHelper, String str, String str2, String str3, int i11, String str4, Bundle bundle, boolean z11, String str5, Function0 function0, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str3 = str;
        }
        if ((i12 & 16) != 0) {
            str4 = null;
        }
        if ((i12 & 32) != 0) {
            bundle = null;
        }
        if ((i12 & 64) != 0) {
            z11 = false;
        }
        if ((i12 & 128) != 0) {
            str5 = null;
        }
        if ((i12 & 256) != 0) {
            function0 = null;
        }
        return rnDialogHelper.openRnDialog(str, str2, str3, i11, str4, bundle, z11, str5, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupRnContainerTouchInterceptor$lambda$15(BottomSheetBehavior bottomSheetBehavior, RnContainerLayout rnContainerLayout) {
        bottomSheetBehavior.setDraggable(false);
        ViewParent parent = rnContainerLayout.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupRnContainerTouchInterceptor$lambda$16(BottomSheetBehavior bottomSheetBehavior, RnContainerLayout rnContainerLayout) {
        bottomSheetBehavior.setDraggable(true);
        ViewParent parent = rnContainerLayout.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final DialogFragmentHelper openRnDialog(@NotNull String biz, @NotNull String entry, @NotNull String component, int viewHeight, @Nullable String backup, @Nullable Bundle params, boolean ignoreHandleBackPressed, @Nullable String dialogId, @Nullable Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(component, "component");
        DialogFragmentHelper dialogFragmentHelperCreateDialog = createDialog(buildFragmentArgs(biz, entry, component, backup, ignoreHandleBackPressed, dialogId, params), viewHeight, onDismiss, dialogId);
        if (dialogId != null) {
            RnDialogInstanceManager.INSTANCE.registerDialog(dialogId, dialogFragmentHelperCreateDialog);
        }
        return dialogFragmentHelperCreateDialog;
    }

    private final Bundle buildFragmentArgs(String biz, String entry, String component, String backup, boolean ignoreHandleBackPressed, String dialogId, Bundle customParams) {
        Bundle bundle = new Bundle();
        bundle.putString("biz", biz);
        bundle.putString(KEY_ENTRY, entry);
        bundle.putString("component", component);
        if (backup != null) {
            bundle.putString(KEY_BACKUP, backup);
        }
        bundle.putBoolean(KEY_IGNORE_BACK, ignoreHandleBackPressed);
        if (dialogId != null) {
            bundle.putString(KEY_DIALOG_ID, dialogId);
        }
        if (customParams != null) {
            bundle.putAll(customParams);
        }
        return bundle;
    }

    private final DialogFragmentHelper createDialog(final Bundle fragmentArgs, final int viewHeight, final Function0<Unit> onDismiss, final String dialogId) {
        final DialogFragmentHelper dialogFragmentHelperNewInstance$default = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, C23207R.layout.dialog_rn_bottom_sheet, 0, 0, 0, false, true, false, false, true, 222, null);
        dialogFragmentHelperNewInstance$default.m54238g4(new Function1() { // from class: com.kubi.rn.ui.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RnDialogHelper.createDialog$lambda$10((BaseViewHolder) obj);
            }
        });
        dialogFragmentHelperNewInstance$default.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.kubi.rn.ui.RnDialogHelper.createDialog.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                View view = dialogFragmentHelperNewInstance$default.getView();
                if (view != null) {
                    int i11 = viewHeight;
                    DialogFragmentHelper dialogFragmentHelper = dialogFragmentHelperNewInstance$default;
                    Bundle bundle = fragmentArgs;
                    BaseViewHolder baseViewHolder = new BaseViewHolder(view);
                    RnDialogHelper rnDialogHelper = RnDialogHelper.INSTANCE;
                    FrameLayout frameLayout = rnDialogHelper.setupBottomSheetBehavior(i11, dialogFragmentHelper);
                    rnDialogHelper.attachReactFragment(dialogFragmentHelper, baseViewHolder, bundle);
                    if (frameLayout != null) {
                        rnDialogHelper.setupRnContainerTouchInterceptor(frameLayout);
                    }
                }
                dialogFragmentHelperNewInstance$default.getLifecycle().removeObserver(this);
            }
        });
        dialogFragmentHelperNewInstance$default.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.rn.ui.u
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                RnDialogHelper.createDialog$lambda$12(onDismiss, dialogId, dialogInterface);
            }
        });
        return dialogFragmentHelperNewInstance$default;
    }

    public static /* synthetic */ DialogFragmentHelper createDialog$default(RnDialogHelper rnDialogHelper, Bundle bundle, int i11, Function0 function0, String str, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str = null;
        }
        return rnDialogHelper.createDialog(bundle, i11, function0, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDialog$lambda$10(BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        INSTANCE.setupRoundedCorners(viewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createDialog$lambda$12(Function0 function0, String str, DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
        if (str != null) {
            RnDialogInstanceManager.INSTANCE.unregisterDialog(str);
        }
    }

    public static /* synthetic */ DialogFragmentHelper openRnDialog$default(RnDialogHelper rnDialogHelper, String str, Function2 function2, OnDialogDismissedListener onDialogDismissedListener, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            onDialogDismissedListener = null;
        }
        return rnDialogHelper.openRnDialog(str, function2, onDialogDismissedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openRnDialog$lambda$2(String str, OnDialogDismissedListener onDialogDismissedListener) {
        RnDialogCallbackManager rnDialogCallbackManager = RnDialogCallbackManager.INSTANCE;
        String cachedData = rnDialogCallbackManager.getCachedData(str);
        if (rnDialogCallbackManager.hasCallback(str)) {
            rnDialogCallbackManager.removeCallback(str);
        }
        RnDialogInstanceManager.INSTANCE.unregisterDialog(str);
        if (onDialogDismissedListener != null) {
            onDialogDismissedListener.onClose(cachedData);
        }
        return Unit.INSTANCE;
    }

    private final RouteInfo parseKrnRouteFromUri(Uri uri) {
        String queryParameter;
        String queryParameter2 = uri.getQueryParameter("biz");
        String str = queryParameter2 == null ? "" : queryParameter2;
        String queryParameter3 = uri.getQueryParameter(KEY_ENTRY);
        String str2 = queryParameter3 == null ? "" : queryParameter3;
        String queryParameter4 = uri.getQueryParameter("component");
        String str3 = queryParameter4 == null ? "" : queryParameter4;
        String queryParameter5 = uri.getQueryParameter(VIEW_HEIGHT);
        int i11 = queryParameter5 != null ? Integer.parseInt(queryParameter5) : 0;
        String queryParameter6 = uri.getQueryParameter(KEY_BACKUP);
        String queryParameter7 = uri.getQueryParameter(KEY_ROUTE);
        Set of2 = SetsKt.setOf((Object[]) new String[]{"biz", KEY_ENTRY, "component", KEY_BACKUP, KEY_ROUTE, VIEW_HEIGHT});
        Bundle bundle = new Bundle();
        if (queryParameter7 != null) {
            bundle.putString(KEY_ROUTE, URLEncoder.encode(queryParameter7, "UTF-8"));
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        for (String str4 : queryParameterNames) {
            if (!of2.contains(str4) && (queryParameter = uri.getQueryParameter(str4)) != null) {
                bundle.putString(str4, queryParameter);
            }
        }
        return new RouteInfo(str, str2, str3, i11, queryParameter6, queryParameter7, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupRnContainerTouchInterceptor(FrameLayout bottomSheet) {
        final RnContainerLayout rnContainerLayout = (RnContainerLayout) bottomSheet.findViewById(C23207R.id.rnContainer);
        if (rnContainerLayout == null) {
            return;
        }
        final BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(bottomSheet);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
        rnContainerLayout.setOnTouchDownListener(new Function0() { // from class: com.kubi.rn.ui.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RnDialogHelper.setupRnContainerTouchInterceptor$lambda$15(bottomSheetBehaviorFrom, rnContainerLayout);
            }
        });
        rnContainerLayout.setOnTouchUpListener(new Function0() { // from class: com.kubi.rn.ui.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RnDialogHelper.setupRnContainerTouchInterceptor$lambda$16(bottomSheetBehaviorFrom, rnContainerLayout);
            }
        });
    }

    private final void setupRoundedCorners(BaseViewHolder viewHolder) {
        try {
            RnContainerLayout rnContainerLayout = (RnContainerLayout) viewHolder.getView(C23207R.id.rnContainer);
            final float fApplyDimension = TypedValue.applyDimension(1, 16.0f, rnContainerLayout.getContext().getResources().getDisplayMetrics());
            rnContainerLayout.setClipToOutline(true);
            rnContainerLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.kubi.rn.ui.RnDialogHelper.setupRoundedCorners.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(outline, "outline");
                    int width = view.getWidth();
                    int height = view.getHeight();
                    float f11 = fApplyDimension;
                    outline.setRoundRect(0, 0, width, height + (((int) f11) * 2), f11);
                }
            });
        } catch (Exception e11) {
            C44128b.m97270n(TAG, "setupRoundedCorners exception:" + e11);
        }
    }

    @Nullable
    public final String getLastSubmitData() {
        String str = lastDialogId;
        if (str != null) {
            return RnDialogCallbackManager.INSTANCE.getCachedData(str);
        }
        return null;
    }

    public final void registerDialogId(@NotNull String dialogId, @NotNull DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        RnDialogInstanceManager.INSTANCE.registerDialog(dialogId, dialog);
    }

    public final void unregisterDialogId(@NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        RnDialogInstanceManager.INSTANCE.unregisterDialog(dialogId);
    }

    private RnDialogHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachReactFragment(DialogFragmentHelper dialog, BaseViewHolder viewHolder, Bundle fragmentArgs) {
        if (!dialog.isAdded()) {
            C43840a.m96550d(TAG, "Dialog not added yet, skip attach react fragment");
            return;
        }
        if (dialog.isDetached()) {
            C43840a.m96550d(TAG, "Dialog is detached, skip attach react fragment");
            return;
        }
        try {
            dialog.getChildFragmentManager().beginTransaction().replace(C23207R.id.rnContainer, ReactRootFragment.INSTANCE.newInstance(fragmentArgs)).commitAllowingStateLoss();
        } catch (Exception e11) {
            C44128b.m97262f(TAG, "Unexpected error when attaching react fragment:", e11);
        }
    }

    private final RouteInfo parseRoute(String str) {
        return parseKrnRouteFromUri(Uri.parse(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout setupBottomSheetBehavior(int viewHeight, DialogFragmentHelper dialog) {
        Window window;
        View decorView;
        FrameLayout frameLayout;
        Dialog dialog2 = dialog.getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null && (frameLayout = (FrameLayout) decorView.findViewById(C7090R.id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            if (viewHeight == 0) {
                viewHeight = C5267e0.m6182d();
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = viewHeight;
            frameLayout.setLayoutParams(layoutParams);
            bottomSheetBehaviorFrom.setPeekHeight(viewHeight);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setDraggable(true);
            return frameLayout;
        }
        return null;
    }

    @NotNull
    public final DialogFragmentHelper openRnDialog(@NotNull String route, @NotNull Function2<? super String, ? super KCBridgeRejecterError, Unit> callback, @Nullable final OnDialogDismissedListener onDismissed) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lastDialogId = string;
        RouteInfo route2 = parseRoute(route);
        RnDialogCallbackManager.INSTANCE.registerCallback(string, callback);
        DialogFragmentHelper dialogFragmentHelperOpenRnDialog$default = openRnDialog$default(this, route2.getBiz(), route2.getEntry(), route2.getComponent(), route2.getViewHeight(), route2.getBackup(), route2.getParams(), false, string, new Function0() { // from class: com.kubi.rn.ui.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RnDialogHelper.openRnDialog$lambda$2(string, onDismissed);
            }
        }, 64, null);
        RnDialogInstanceManager.INSTANCE.registerDialog(string, dialogFragmentHelperOpenRnDialog$default);
        return dialogFragmentHelperOpenRnDialog$default;
    }
}
