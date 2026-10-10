package com.kubi.assets.freeze;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.R$drawable;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27041f;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.assets.freeze.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FreezeDialogHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/freeze/FreezeDialogHelper;", "", "<init>", "()V", "CONTENT", "", "BUTTON_TEXT", "showFreezeMiddleGroundDialog", "", "res", "Lcom/kubi/assets/freeze/AssetMiddleGroundResource;", "code", "showWithdrawFreezeDialog", "showCommonFreezeDialog", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFreezeDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreezeDialogHelper.kt\ncom/kubi/assets/freeze/FreezeDialogHelper\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,64:1\n19#2,2:65\n*S KotlinDebug\n*F\n+ 1 FreezeDialogHelper.kt\ncom/kubi/assets/freeze/FreezeDialogHelper\n*L\n22#1:65,2\n*E\n"})
public final class FreezeDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FreezeDialogHelper f17531a = new FreezeDialogHelper();

    /* JADX INFO: renamed from: i */
    public static final void m16920i(String str, AssetMiddleGroundResource assetMiddleGroundResource) {
        if (Intrinsics.areEqual(str, "26021")) {
            f17531a.m16924j(str, assetMiddleGroundResource);
        } else if (Intrinsics.areEqual(str, "26020")) {
            f17531a.m16922e(assetMiddleGroundResource);
        } else {
            f17531a.m16922e(assetMiddleGroundResource);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m16921k(String str, AssetMiddleGroundResource assetMiddleGroundResource, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FreezeWithdrawDialog.Companion companion = FreezeWithdrawDialog.f17513w0;
        String strM66668h = C27041f.m66668h(assetMiddleGroundResource.getUrl());
        Map<String, String> srcTextMap = assetMiddleGroundResource.getSrcTextMap();
        FreezeWithdrawDialog freezeWithdrawDialogCreate = companion.create(str, strM66668h, C27041f.m66668h(srcTextMap != null ? srcTextMap.get("content") : null));
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        freezeWithdrawDialogCreate.show(supportFragmentManager, "FreezeWithdrawDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final void m16923h(@Nullable final AssetMiddleGroundResource assetMiddleGroundResource, @NotNull final String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        if (assetMiddleGroundResource == null) {
            return;
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.freeze.f
            @Override // java.lang.Runnable
            public final void run() {
                FreezeDialogHelper.m16920i(code, assetMiddleGroundResource);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m16924j(final String str, final AssetMiddleGroundResource assetMiddleGroundResource) {
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.freeze.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FreezeDialogHelper.m16921k(str, assetMiddleGroundResource, (FragmentActivity) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m16918f(AssetMiddleGroundResource assetMiddleGroundResource, DialogInterface dialogInterface, int i11) {
        RouteExKt.m56217H(assetMiddleGroundResource.getUrl());
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m16922e(final AssetMiddleGroundResource assetMiddleGroundResource) {
        String str;
        Map<String, String> srcTextMap = assetMiddleGroundResource.getSrcTextMap();
        String str2 = null;
        if (srcTextMap != null) {
            str = srcTextMap.get("content");
        } else {
            str = null;
        }
        Map<String, String> srcTextMap2 = assetMiddleGroundResource.getSrcTextMap();
        if (srcTextMap2 != null) {
            str2 = srcTextMap2.get("btnTxt");
        }
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            C42899b.m94076f(AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54173d5(false).m54156M4(str).m54157N4(true).m54163T4(str2, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.freeze.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    FreezeDialogHelper.m16918f(assetMiddleGroundResource, dialogInterface, i11);
                }
            }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.freeze.h
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    FreezeDialogHelper.m16919g(dialogInterface);
                }
            }), "assets_dialog_AssetFreezeInterceptor");
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m16919g(DialogInterface dialogInterface) {
    }
}
