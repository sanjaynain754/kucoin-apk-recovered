package com.kubi.kumex.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.helper.C16108t;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.ItemCallBack;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import fm.C37570e;
import i30.InterfaceC38436a;
import java.util.LinkedList;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import qe0.C43724b;

/* JADX INFO: renamed from: com.kubi.kumex.dialog.a2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteMenuDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001fJ2\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010!J \u0010\"\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010!H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/dialog/QuoteMenuDialog;", "Lcom/kubi/resources/widget/BubbleEasyPopup;", "context", "Landroid/content/Context;", CheckIsFavorCommand.KEY_IS_FAV, "", "isQuotes", "pageId", "", "<init>", "(Landroid/content/Context;ZZLjava/lang/String;)V", "mFavoriteApi", "Lcom/kubi/tradebase/api/FavoriteApi;", "kotlin.jvm.PlatformType", "getMFavoriteApi", "()Lcom/kubi/tradebase/api/FavoriteApi;", "mFavoriteApi$delegate", "Lkotlin/Lazy;", "queue", "Ljava/util/LinkedList;", "Ljava/lang/Runnable;", "initViews", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "quotes", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "bind", TUIConstants.TUIChat.CALL_BACK, "Lcom/kubi/sdk/ItemCallBack;", "updateListCallback", "Lkotlin/Function0;", "stickySymbolForV2", "trackFavouriteEvent", "trackStickyEvent", "isSticky", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteMenuDialog extends BubbleEasyPopup {

    /* JADX INFO: renamed from: D */
    public final boolean f28876D;

    /* JADX INFO: renamed from: E */
    public final boolean f28877E;

    /* JADX INFO: renamed from: F */
    @Nullable
    public final String f28878F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public final Lazy f28879G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final LinkedList<Runnable> f28880H;

    public /* synthetic */ QuoteMenuDialog(Context context, boolean z11, boolean z12, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteMenuDialog(@NotNull Context context, boolean z11, boolean z12, @Nullable String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28876D = z11;
        this.f28877E = z12;
        this.f28878F = str;
        this.f28879G = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.dialog.r1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteMenuDialog.m33577I0();
            }
        });
        this.f28880H = new LinkedList<>();
        m96317a0(-2);
        m96307Q(R$layout.bkumex_popup_quotes);
        m96316Z(false);
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m33570A0(final QuotesEntity quotesEntity, QuoteMenuDialog quoteMenuDialog, final ItemCallBack itemCallBack, final View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z11 = !C37570e.m84690e(quotesEntity.getSymbol());
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c()) {
            C16108t.m34070o(C27041f.m66668h(quotesEntity.getSymbol()), z11, new Function0() { // from class: com.kubi.kumex.dialog.v1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteMenuDialog.m33571B0(itemCallBack, it, quotesEntity);
                }
            });
        } else if (TextUtils.isEmpty(kuMexDepend.m35905g().d()) || !kuMexDepend.m35905g().o()) {
            C16108t.m34078w(C27041f.m66668h(quotesEntity.getSymbol()), z11, new Function0() { // from class: com.kubi.kumex.dialog.x1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteMenuDialog.m33573D0(itemCallBack, it, quotesEntity);
                }
            });
        } else {
            IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.dialog.w1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteMenuDialog.m33572C0();
                }
            }), 1, (Object) null);
        }
        quoteMenuDialog.m33590J0(z11);
        quoteMenuDialog.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m33571B0(ItemCallBack itemCallBack, View view, QuotesEntity quotesEntity) {
        if (itemCallBack != null) {
            itemCallBack.mo24515a(view, 0, quotesEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m33572C0() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D0 */
    public static final Unit m33573D0(ItemCallBack itemCallBack, View view, QuotesEntity quotesEntity) {
        if (itemCallBack != null) {
            itemCallBack.mo24515a(view, 0, quotesEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m33574E0(final QuotesEntity quotesEntity, QuoteMenuDialog quoteMenuDialog, final ItemCallBack itemCallBack, final View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z11 = !C37570e.m84692g(quotesEntity.getSymbol());
        KuMexDepend kuMexDepend = KuMexDepend.f30378a;
        if (kuMexDepend.m35905g().c()) {
            C16108t.m34051D(C27041f.m66668h(quotesEntity.getSymbol()), z11, new Function0() { // from class: com.kubi.kumex.dialog.y1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteMenuDialog.m33575F0(itemCallBack, it, quotesEntity);
                }
            });
        } else {
            IUserService.O(kuMexDepend.m35905g(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.kumex.dialog.z1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return QuoteMenuDialog.m33576G0();
                }
            }), 1, (Object) null);
        }
        quoteMenuDialog.m33591K0(z11);
        quoteMenuDialog.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m33575F0(ItemCallBack itemCallBack, View view, QuotesEntity quotesEntity) {
        if (itemCallBack != null) {
            itemCallBack.mo24515a(view, 1, quotesEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m33576G0() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m33587y0(QuoteMenuDialog quoteMenuDialog, QuotesEntity quotesEntity, ItemCallBack itemCallBack, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            itemCallBack = null;
        }
        quoteMenuDialog.m33592x0(quotesEntity, itemCallBack);
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m33589H0(QuotesEntity quotesEntity) {
        return KuMexDepend.f30378a.m35905g().c() ? RepositoryServiceLocator.f19236a.m20288g().mo24976A().contains(C27041f.m66668h(quotesEntity.getSymbol())) : IQuoteFacadeService.f41383a.get().mo50715s(C27041f.m66668h(quotesEntity.getSymbol()));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m33590J0(boolean z11) {
        String str = this.f28878F;
        if (str == null || str.length() == 0) {
            return;
        }
        C43852m.m96590b(this.f28878F, "ContractList", "1", TuplesKt.m90091to("favourite", z11 ? "add" : "cancel"));
    }

    /* JADX INFO: renamed from: K0 */
    public final void m33591K0(boolean z11) {
        String str = this.f28878F;
        if (str == null || str.length() == 0) {
            return;
        }
        C43852m.m96590b(this.f28878F, "ContractList", "2", TuplesKt.m90091to(ViewProps.TOP, z11 ? "add" : "cancel"));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m33592x0(@NotNull final QuotesEntity quotes, @Nullable final ItemCallBack<QuotesEntity> itemCallBack) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Runnable runnable = new Runnable() { // from class: com.kubi.kumex.dialog.s1
            @Override // java.lang.Runnable
            public final void run() {
                QuoteMenuDialog.m33588z0(this.f28980b, quotes, itemCallBack);
            }
        };
        View viewM96292A = m96292A();
        if ((viewM96292A != null ? viewM96292A.findViewById(R$id.llFavor) : null) != null) {
            View viewM96292A2 = m96292A();
            if ((viewM96292A2 != null ? viewM96292A2.findViewById(R$id.llPin) : null) != null) {
                runnable.run();
                return;
            }
        }
        this.f28880H.addLast(runnable);
    }

    /* JADX INFO: renamed from: I0 */
    public static final InterfaceC38436a m33577I0() {
        return (InterfaceC38436a) C42597a.m93388d().create(InterfaceC38436a.class);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m33588z0(final QuoteMenuDialog quoteMenuDialog, final QuotesEntity quotesEntity, final ItemCallBack itemCallBack) {
        int i11;
        int i12;
        View viewM96292A = quoteMenuDialog.m96292A();
        if (viewM96292A != null) {
            ImageView imageView = (ImageView) viewM96292A.findViewById(R$id.ivFavor);
            if (imageView != null) {
                if (!quoteMenuDialog.f28876D && !quoteMenuDialog.m33589H0(quotesEntity)) {
                    i12 = R$drawable.ic_unfav_white;
                } else {
                    i12 = R$mipmap.ic_favor;
                }
                imageView.setImageResource(i12);
            }
            View viewFindViewById = viewM96292A.findViewById(R$id.llFavor);
            if (viewFindViewById != null) {
                ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.dialog.t1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuoteMenuDialog.m33570A0(quotesEntity, quoteMenuDialog, itemCallBack, (View) obj);
                    }
                });
            }
            int i13 = R$id.llPin;
            View viewFindViewById2 = viewM96292A.findViewById(i13);
            if (viewFindViewById2 != null) {
                C27046k.m66684G(viewFindViewById2, quoteMenuDialog.f28876D);
            }
            ImageView imageView2 = (ImageView) viewM96292A.findViewById(R$id.ivPin);
            if (imageView2 != null) {
                if (C37570e.m84692g(quotesEntity.getSymbol())) {
                    i11 = R$mipmap.ic_stick;
                } else {
                    i11 = R$drawable.icon_unstick_white;
                }
                imageView2.setImageResource(i11);
            }
            View viewFindViewById3 = viewM96292A.findViewById(i13);
            if (viewFindViewById3 != null) {
                ViewExtKt.m66575f(viewFindViewById3, new Function1() { // from class: com.kubi.kumex.dialog.u1
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuoteMenuDialog.m33574E0(quotesEntity, quoteMenuDialog, itemCallBack, (View) obj);
                    }
                });
            }
        }
    }

    @Override // com.kubi.resources.widget.BubbleEasyPopup, qe0.C43724b, qe0.AbstractC43723a
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@Nullable View view, @Nullable C43724b c43724b) {
        super.mo25306H(view, c43724b);
        while (!this.f28880H.isEmpty()) {
            Runnable runnablePoll = this.f28880H.poll();
            if (runnablePoll != null) {
                runnablePoll.run();
            }
        }
    }
}
