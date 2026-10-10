package com.kubi.mine.lib.p101ui;

import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5290q;
import com.blankj.utilcode.util.C5302w;
import com.google.gson.reflect.TypeToken;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.entity.SocialMediaEntity;
import com.kubi.mine.lib.util.MineStorageIds;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gq.C37997r;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p319hq.InterfaceC38285b;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import xb0.C46126b;
import y70.C46392a;

/* JADX INFO: compiled from: ContactUsFragment.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001b\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/ContactUsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/mine/databinding/KucoinMineViewRecyclerviewBinding;", "getBinding", "()Lcom/kubi/mine/databinding/KucoinMineViewRecyclerviewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "createAdater", "com/kubi/mine/lib/ui/ContactUsFragment$createAdater$1", "list", "", "Lcom/kubi/mine/lib/entity/SocialMediaEntity;", "(Ljava/util/List;)Lcom/kubi/mine/lib/ui/ContactUsFragment$createAdater$1;", "wechatContact", "item", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nContactUsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactUsFragment.kt\ncom/kubi/mine/lib/ui/ContactUsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,174:1\n147#2,16:175\n32#3:191\n23#3,2:192\n*S KotlinDebug\n*F\n+ 1 ContactUsFragment.kt\ncom/kubi/mine/lib/ui/ContactUsFragment\n*L\n54#1:175,16\n71#1:191\n89#1:192,2\n*E\n"})
public final class ContactUsFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ KProperty<Object>[] f35179V = {Reflection.property1(new PropertyReference1Impl(ContactUsFragment.class, "binding", "getBinding()Lcom/kubi/mine/databinding/KucoinMineViewRecyclerviewBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f35180U = C45681e.m100799e(this, new Function1<ContactUsFragment, C37997r>() { // from class: com.kubi.mine.lib.ui.ContactUsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37997r invoke(@NotNull ContactUsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37997r.m85869a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37997r, Unit>() { // from class: com.kubi.mine.lib.ui.ContactUsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37997r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37997r c37997r) {
            invoke(c37997r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.ContactUsFragment$a */
    /* JADX INFO: compiled from: ContactUsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/mine/lib/ui/ContactUsFragment$onViewCreated$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/mine/lib/entity/SocialMediaEntity;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19015a extends TypeToken<List<? extends SocialMediaEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.mine.lib.ui.ContactUsFragment$b */
    /* JADX INFO: compiled from: ContactUsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/mine/lib/ui/ContactUsFragment$wechatContact$1$2$1$1$1", "Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;", "onMediaScannerConnected", "", "onScanCompleted", "path", "", "uri", "Landroid/net/Uri;", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19016b implements MediaScannerConnection.MediaScannerConnectionClient {
        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String path, Uri uri) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(uri, "uri");
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m41901B3(final ContactUsFragment contactUsFragment, final ImageView imageView) {
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(contactUsFragment), "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactUsFragment.m41902C3(imageView, contactUsFragment, ((Boolean) obj).booleanValue());
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.mine.lib.ui.d0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContactUsFragment.m41904E3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.mine.lib.ui.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactUsFragment.m41905F3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.mine.lib.ui.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContactUsFragment.m41906G3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, contactUsFragment.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m41902C3(ImageView imageView, final ContactUsFragment contactUsFragment, boolean z11) {
        final String str = C5302w.m6508c() + "/wechat" + System.currentTimeMillis() + ".jpg";
        if (z11 && C5290q.m6359j(C5290q.m6362m(imageView), str, Bitmap.CompressFormat.JPEG)) {
            ToastCompat.m66441G(contactUsFragment.getString(R$string.save_qrcode_ok, str), new Object[0]);
            C27100x0.m66924e(new Function0() { // from class: com.kubi.mine.lib.ui.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContactUsFragment.m41903D3(str, contactUsFragment);
                }
            });
        } else {
            ToastCompat.m66437C(R$string.failed);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m41905F3(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ToastCompat.m66441G(throwable.getMessage(), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m41920z3(SocialMediaEntity socialMediaEntity, final ContactUsFragment contactUsFragment, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        final ImageView imageView = (ImageView) viewHolder.getView(R$id.iv_qr_code);
        C46338a.m102151a(imageView.getContext()).mo6634v(socialMediaEntity.getLink()).m6594E0(imageView);
        viewHolder.setText(R$id.tv_coin_name, R$string.wechat_group_tips);
        View view = viewHolder.getView(R$id.iv_close_dialog);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactUsFragment.m41900A3(dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.fl_save_qr);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.mine.lib.ui.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContactUsFragment.m41901B3(this.f35254b, imageView);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_mine_view_recyclerview, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Observable<R> observableCompose;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37997r c37997rM41922v3 = m41922v3();
        if (c37997rM41922v3 != null && (recyclerView2 = c37997rM41922v3.f85592b) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        String strM102326h = C46392a.m102326h(MineStorageIds.f35421a.getContactUsSid(), "");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strM102326h)) {
            Type type = new C19015a().getType();
            if (((List) C27099x.m66914d(strM102326h, type)) != null) {
                arrayList.addAll((Collection) C27099x.m66914d(strM102326h, type));
            }
        }
        final ContactUsFragment$createAdater$1 contactUsFragment$createAdater$1M41921u3 = m41921u3(arrayList);
        C37997r c37997rM41922v4 = m41922v3();
        if (c37997rM41922v4 != null && (recyclerView = c37997rM41922v4.f85592b) != null) {
            recyclerView.setAdapter(contactUsFragment$createAdater$1M41921u3);
        }
        Observable<BaseEntity<ArrayList<SocialMediaEntity>>> observableM86415j = ((InterfaceC38285b) C42597a.m93386b().create(InterfaceC38285b.class)).m86415j(MultiLanguageManager.f46811g.getLocalString());
        if (observableM86415j == null || (observableCompose = observableM86415j.compose(C24217a1.m58389m())) == 0) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContactUsFragment.m41918w3(contactUsFragment$createAdater$1M41921u3, (ArrayList) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.mine.lib.ui.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ContactUsFragment.m41919x3(function1, obj);
            }
        }, new C24223c1(null));
        if (disposableSubscribe != null) {
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final ContactUsFragment$createAdater$1 m41921u3(List<SocialMediaEntity> list) {
        return new ContactUsFragment$createAdater$1(list, this, R$layout.kucoin_item_contact_us);
    }

    /* JADX INFO: renamed from: v3 */
    public final C37997r m41922v3() {
        return (C37997r) this.f35180U.getValue(this, f35179V[0]);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m41923y3(final SocialMediaEntity socialMediaEntity) {
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.kucoin_dialog_deposit_qrcode, 1, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.mine.lib.ui.z
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ContactUsFragment.m41920z3(socialMediaEntity, this, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "wechat_qrcode");
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m41900A3(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m41903D3(String str, ContactUsFragment contactUsFragment) {
        if (TextUtils.isEmpty(str)) {
            return Unit.INSTANCE;
        }
        FragmentActivity activity = contactUsFragment.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        MediaScannerConnection.scanFile(activity, new String[]{str}, new String[]{"image/jpeg"}, new C19016b());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m41904E3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m41906G3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m41918w3(BaseQuickAdapter baseQuickAdapter, ArrayList arrayList) {
        Intrinsics.checkNotNull(arrayList);
        baseQuickAdapter.replaceData(arrayList);
        C46392a.m102333p(MineStorageIds.f35421a.getContactUsSid(), C27099x.m66919i(arrayList, false, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final void m41919x3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
