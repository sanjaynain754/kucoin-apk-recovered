package com.kubi.mart.sidebar.spot.helper;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kubi.mart.R$mipmap;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p182cq.C36518c;
import p268fq.C37578a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpotSidebarSortHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\r\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007J\u0006\u0010\u000e\u001a\u00020\bJ\b\u0010\u000f\u001a\u00020\tH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/SpotSidebarSortHelper;", "", "<init>", "()V", "binding", "Lcom/kubi/mart/databinding/MartLayoutSortHeaderBinding;", "sortTypeCallback", "Lkotlin/Function1;", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "", "initOnClick", "Ljava/util/concurrent/atomic/AtomicBoolean;", "init", "setSortListener", "getCurrentSortType", "sortByName", "sortByPrice", "sortByChangeRate", "resetLastState", "Companion", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotSidebarSortHelper {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f34741d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static SortType f34742e = SortType.NONE;

    /* JADX INFO: renamed from: a */
    @Nullable
    public C36518c f34743a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Function1<? super SortType, Unit> f34744b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicBoolean f34745c = new AtomicBoolean(false);

    /* JADX INFO: compiled from: SpotSidebarSortHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/SpotSidebarSortHelper$Companion;", "", "<init>", "()V", "currentSelectedSortType", "Lcom/kubi/mart/sidebar/spot/helper/SortType;", "getCurrentSelectedSortType$annotations", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.helper.SpotSidebarSortHelper$a */
    /* JADX INFO: compiled from: SpotSidebarSortHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C18856a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SortType.values().length];
            try {
                iArr[SortType.NAME_ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortType.NAME_DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortType.PRICE_ASC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SortType.PRICE_DESC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SortType.CHANGE_RATE_ASC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SortType.CHANGE_RATE_DESC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SortType.NONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m41475k(final SpotSidebarSortHelper spotSidebarSortHelper, C36518c c36518c) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        spotSidebarSortHelper.f34743a = c36518c;
        spotSidebarSortHelper.m41485o();
        if (spotSidebarSortHelper.f34745c.compareAndSet(false, true)) {
            if (c36518c != null && (linearLayout3 = c36518c.f79361f) != null) {
                C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotSidebarSortHelper.m41476l(this.f34778b);
                    }
                }, 1, null);
            }
            if (c36518c != null && (linearLayout2 = c36518c.f79362g) != null) {
                C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.j
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotSidebarSortHelper.m41477m(this.f34779b);
                    }
                }, 1, null);
            }
            if (c36518c != null && (linearLayout = c36518c.f79360e) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SpotSidebarSortHelper.m41478n(this.f34780b);
                    }
                }, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m41479p(SpotSidebarSortHelper spotSidebarSortHelper) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        ImageView imageView12;
        ImageView imageView13;
        ImageView imageView14;
        ImageView imageView15;
        ImageView imageView16;
        ImageView imageView17;
        ImageView imageView18;
        ImageView imageView19;
        ImageView imageView20;
        ImageView imageView21;
        switch (C18856a.$EnumSwitchMapping$0[f34742e.ordinal()]) {
            case 1:
                C36518c c36518c = spotSidebarSortHelper.f34743a;
                if (c36518c != null && (imageView3 = c36518c.f79358c) != null) {
                    imageView3.setImageResource(R$mipmap.ic_sort_up);
                }
                C36518c c36518c2 = spotSidebarSortHelper.f34743a;
                if (c36518c2 != null && (imageView2 = c36518c2.f79359d) != null) {
                    imageView2.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c3 = spotSidebarSortHelper.f34743a;
                if (c36518c3 != null && (imageView = c36518c3.f79357b) != null) {
                    imageView.setImageResource(R$mipmap.ic_sort_default);
                }
                break;
            case 2:
                C36518c c36518c4 = spotSidebarSortHelper.f34743a;
                if (c36518c4 != null && (imageView6 = c36518c4.f79358c) != null) {
                    imageView6.setImageResource(R$mipmap.ic_sort_down);
                }
                C36518c c36518c5 = spotSidebarSortHelper.f34743a;
                if (c36518c5 != null && (imageView5 = c36518c5.f79359d) != null) {
                    imageView5.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c6 = spotSidebarSortHelper.f34743a;
                if (c36518c6 != null && (imageView4 = c36518c6.f79357b) != null) {
                    imageView4.setImageResource(R$mipmap.ic_sort_default);
                }
                break;
            case 3:
                C36518c c36518c7 = spotSidebarSortHelper.f34743a;
                if (c36518c7 != null && (imageView9 = c36518c7.f79358c) != null) {
                    imageView9.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c8 = spotSidebarSortHelper.f34743a;
                if (c36518c8 != null && (imageView8 = c36518c8.f79359d) != null) {
                    imageView8.setImageResource(R$mipmap.ic_sort_up);
                }
                C36518c c36518c9 = spotSidebarSortHelper.f34743a;
                if (c36518c9 != null && (imageView7 = c36518c9.f79357b) != null) {
                    imageView7.setImageResource(R$mipmap.ic_sort_default);
                }
                break;
            case 4:
                C36518c c36518c10 = spotSidebarSortHelper.f34743a;
                if (c36518c10 != null && (imageView12 = c36518c10.f79358c) != null) {
                    imageView12.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c11 = spotSidebarSortHelper.f34743a;
                if (c36518c11 != null && (imageView11 = c36518c11.f79359d) != null) {
                    imageView11.setImageResource(R$mipmap.ic_sort_down);
                }
                C36518c c36518c12 = spotSidebarSortHelper.f34743a;
                if (c36518c12 != null && (imageView10 = c36518c12.f79357b) != null) {
                    imageView10.setImageResource(R$mipmap.ic_sort_default);
                }
                break;
            case 5:
                C36518c c36518c13 = spotSidebarSortHelper.f34743a;
                if (c36518c13 != null && (imageView15 = c36518c13.f79358c) != null) {
                    imageView15.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c14 = spotSidebarSortHelper.f34743a;
                if (c36518c14 != null && (imageView14 = c36518c14.f79359d) != null) {
                    imageView14.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c15 = spotSidebarSortHelper.f34743a;
                if (c36518c15 != null && (imageView13 = c36518c15.f79357b) != null) {
                    imageView13.setImageResource(R$mipmap.ic_sort_up);
                }
                break;
            case 6:
                C36518c c36518c16 = spotSidebarSortHelper.f34743a;
                if (c36518c16 != null && (imageView18 = c36518c16.f79358c) != null) {
                    imageView18.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c17 = spotSidebarSortHelper.f34743a;
                if (c36518c17 != null && (imageView17 = c36518c17.f79359d) != null) {
                    imageView17.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c18 = spotSidebarSortHelper.f34743a;
                if (c36518c18 != null && (imageView16 = c36518c18.f79357b) != null) {
                    imageView16.setImageResource(R$mipmap.ic_sort_down);
                }
                break;
            case 7:
                C36518c c36518c19 = spotSidebarSortHelper.f34743a;
                if (c36518c19 != null && (imageView21 = c36518c19.f79358c) != null) {
                    imageView21.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c20 = spotSidebarSortHelper.f34743a;
                if (c36518c20 != null && (imageView20 = c36518c20.f79359d) != null) {
                    imageView20.setImageResource(R$mipmap.ic_sort_default);
                }
                C36518c c36518c21 = spotSidebarSortHelper.f34743a;
                if (c36518c21 != null && (imageView19 = c36518c21.f79357b) != null) {
                    imageView19.setImageResource(R$mipmap.ic_sort_default);
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m41480s(SpotSidebarSortHelper spotSidebarSortHelper) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        int i11 = C18856a.$EnumSwitchMapping$0[f34742e.ordinal()];
        if (i11 == 5) {
            f34742e = SortType.NONE;
            C36518c c36518c = spotSidebarSortHelper.f34743a;
            if (c36518c != null && (imageView = c36518c.f79357b) != null) {
                imageView.setImageResource(R$mipmap.ic_sort_default);
            }
        } else if (i11 != 6) {
            f34742e = SortType.CHANGE_RATE_DESC;
            C36518c c36518c2 = spotSidebarSortHelper.f34743a;
            if (c36518c2 != null && (imageView5 = c36518c2.f79358c) != null) {
                imageView5.setImageResource(R$mipmap.ic_sort_default);
            }
            C36518c c36518c3 = spotSidebarSortHelper.f34743a;
            if (c36518c3 != null && (imageView4 = c36518c3.f79359d) != null) {
                imageView4.setImageResource(R$mipmap.ic_sort_default);
            }
            C36518c c36518c4 = spotSidebarSortHelper.f34743a;
            if (c36518c4 != null && (imageView3 = c36518c4.f79357b) != null) {
                imageView3.setImageResource(R$mipmap.ic_sort_down);
            }
        } else {
            f34742e = SortType.CHANGE_RATE_ASC;
            C36518c c36518c5 = spotSidebarSortHelper.f34743a;
            if (c36518c5 != null && (imageView2 = c36518c5.f79357b) != null) {
                imageView2.setImageResource(R$mipmap.ic_sort_up);
            }
        }
        Function1<? super SortType, Unit> function1 = spotSidebarSortHelper.f34744b;
        if (function1 != null) {
            function1.invoke(f34742e);
        }
        C43852m.m96591c(C37578a.f83542a.m84710a(), "sideMarketChangeSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m41481u(SpotSidebarSortHelper spotSidebarSortHelper) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        int i11 = C18856a.$EnumSwitchMapping$0[f34742e.ordinal()];
        if (i11 == 1) {
            f34742e = SortType.NAME_DESC;
            C36518c c36518c = spotSidebarSortHelper.f34743a;
            if (c36518c != null && (imageView = c36518c.f79358c) != null) {
                imageView.setImageResource(R$mipmap.ic_sort_down);
            }
        } else if (i11 != 2) {
            f34742e = SortType.NAME_ASC;
            C36518c c36518c2 = spotSidebarSortHelper.f34743a;
            if (c36518c2 != null && (imageView5 = c36518c2.f79358c) != null) {
                imageView5.setImageResource(R$mipmap.ic_sort_up);
            }
            C36518c c36518c3 = spotSidebarSortHelper.f34743a;
            if (c36518c3 != null && (imageView4 = c36518c3.f79359d) != null) {
                imageView4.setImageResource(R$mipmap.ic_sort_default);
            }
            C36518c c36518c4 = spotSidebarSortHelper.f34743a;
            if (c36518c4 != null && (imageView3 = c36518c4.f79357b) != null) {
                imageView3.setImageResource(R$mipmap.ic_sort_default);
            }
        } else {
            f34742e = SortType.NONE;
            C36518c c36518c5 = spotSidebarSortHelper.f34743a;
            if (c36518c5 != null && (imageView2 = c36518c5.f79358c) != null) {
                imageView2.setImageResource(R$mipmap.ic_sort_default);
            }
        }
        Function1<? super SortType, Unit> function1 = spotSidebarSortHelper.f34744b;
        if (function1 != null) {
            function1.invoke(f34742e);
        }
        C43852m.m96591c(C37578a.f83542a.m84710a(), "sideMarketNameSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m41482w(SpotSidebarSortHelper spotSidebarSortHelper) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        int i11 = C18856a.$EnumSwitchMapping$0[f34742e.ordinal()];
        if (i11 == 3) {
            f34742e = SortType.NONE;
            C36518c c36518c = spotSidebarSortHelper.f34743a;
            if (c36518c != null && (imageView = c36518c.f79359d) != null) {
                imageView.setImageResource(R$mipmap.ic_sort_default);
            }
        } else if (i11 != 4) {
            f34742e = SortType.PRICE_DESC;
            C36518c c36518c2 = spotSidebarSortHelper.f34743a;
            if (c36518c2 != null && (imageView5 = c36518c2.f79358c) != null) {
                imageView5.setImageResource(R$mipmap.ic_sort_default);
            }
            C36518c c36518c3 = spotSidebarSortHelper.f34743a;
            if (c36518c3 != null && (imageView4 = c36518c3.f79359d) != null) {
                imageView4.setImageResource(R$mipmap.ic_sort_down);
            }
            C36518c c36518c4 = spotSidebarSortHelper.f34743a;
            if (c36518c4 != null && (imageView3 = c36518c4.f79357b) != null) {
                imageView3.setImageResource(R$mipmap.ic_sort_default);
            }
        } else {
            f34742e = SortType.PRICE_ASC;
            C36518c c36518c5 = spotSidebarSortHelper.f34743a;
            if (c36518c5 != null && (imageView2 = c36518c5.f79359d) != null) {
                imageView2.setImageResource(R$mipmap.ic_sort_up);
            }
        }
        Function1<? super SortType, Unit> function1 = spotSidebarSortHelper.f34744b;
        if (function1 != null) {
            function1.invoke(f34742e);
        }
        C43852m.m96591c(C37578a.f83542a.m84710a(), "sideMarketPriceSort", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SortType m41483i() {
        return f34742e;
    }

    /* JADX INFO: renamed from: j */
    public final void m41484j(@Nullable final C36518c c36518c) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSortHelper.m41475k(this.f34776b, c36518c);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m41485o() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSortHelper.m41479p(this.f34783b);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m41486q(@NotNull Function1<? super SortType, Unit> sortTypeCallback) {
        Intrinsics.checkNotNullParameter(sortTypeCallback, "sortTypeCallback");
        this.f34744b = sortTypeCallback;
    }

    /* JADX INFO: renamed from: r */
    public final void m41487r() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSortHelper.m41480s(this.f34781b);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m41488t() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSortHelper.m41481u(this.f34782b);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m41489v() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSortHelper.m41482w(this.f34784b);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m41476l(SpotSidebarSortHelper spotSidebarSortHelper) {
        spotSidebarSortHelper.m41488t();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m41477m(SpotSidebarSortHelper spotSidebarSortHelper) {
        spotSidebarSortHelper.m41489v();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m41478n(SpotSidebarSortHelper spotSidebarSortHelper) {
        spotSidebarSortHelper.m41487r();
        return Unit.INSTANCE;
    }
}
