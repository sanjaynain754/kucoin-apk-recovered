package com.kubi.assets.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: EmailAutoHintPop.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000fH\u0007J\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/view/EmailAutoHintPop;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "popupWindow", "Landroid/widget/PopupWindow;", TIMPushProvider.f75062n, "", "anchorView", "Landroid/view/View;", "input", "", "onItemClick", "Lkotlin/Function1;", "dismissSelf", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEmailAutoHintPop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailAutoHintPop.kt\ncom/kubi/assets/view/EmailAutoHintPop\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n774#2:81\n865#2,2:82\n*S KotlinDebug\n*F\n+ 1 EmailAutoHintPop.kt\ncom/kubi/assets/view/EmailAutoHintPop\n*L\n36#1:81\n36#1:82,2\n*E\n"})
public final class EmailAutoHintPop {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PopupWindow f19092a;

    public EmailAutoHintPop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f19092a = new PopupWindow(context);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m20022e(EmailAutoHintPop emailAutoHintPop) {
        emailAutoHintPop.f19092a.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.String] */
    /* JADX INFO: renamed from: g */
    public static final Unit m20023g(String str, EmailAutoHintPop emailAutoHintPop, View view, Function1 function1) {
        List listV0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (StringsKt.contains$default((CharSequence) str, '@', false, 2, (Object) null)) {
            objectRef.element = str.subSequence(0, StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null)).toString();
            List listV1 = AssetsDepend.f18689a.m19189j().v0();
            listV0 = new ArrayList();
            for (Object obj : listV1) {
                String str2 = (String) obj;
                if (StringsKt.startsWith$default(((String) objectRef.element) + '@' + str2, str, false, 2, (Object) null)) {
                    if (!Intrinsics.areEqual(((String) objectRef.element) + '@' + str2, str)) {
                        listV0.add(obj);
                    }
                }
            }
        } else {
            listV0 = AssetsDepend.f18689a.m19189j().v0();
        }
        List list = listV0;
        if (str.length() == 0 || list.isEmpty()) {
            if (emailAutoHintPop.f19092a.isShowing()) {
                emailAutoHintPop.f19092a.dismiss();
            }
            return Unit.INSTANCE;
        }
        Context context = view.getContext();
        if (emailAutoHintPop.f19092a.getContentView() == null) {
            emailAutoHintPop.f19092a.setContentView(LayoutInflater.from(context).inflate(R$layout.asset_layout_signup_email_auto, (ViewGroup) null));
            emailAutoHintPop.f19092a.setBackgroundDrawable(new ColorDrawable(0));
            emailAutoHintPop.f19092a.setWidth(view.getWidth());
            emailAutoHintPop.f19092a.setHeight(-2);
        }
        ((RecyclerView) emailAutoHintPop.f19092a.getContentView().findViewById(R$id.f16365rv)).setAdapter(new EmailAutoHintPop$show$1$1(list, objectRef, function1, emailAutoHintPop, R$layout.asset_item_signup_email_auto));
        if (!emailAutoHintPop.f19092a.isShowing()) {
            PopupWindow popupWindow = emailAutoHintPop.f19092a;
            Intrinsics.checkNotNull(context);
            popupWindow.showAsDropDown(view, 0, (int) C27025c.m66565c(context, 5));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m20024d() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.assets.view.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailAutoHintPop.m20022e(this.f19142b);
            }
        });
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: f */
    public final void m20025f(@NotNull final View anchorView, @NotNull final String input, @NotNull final Function1<? super String, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        C27100x0.m66924e(new Function0() { // from class: com.kubi.assets.view.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailAutoHintPop.m20023g(input, this, anchorView, onItemClick);
            }
        });
    }
}
