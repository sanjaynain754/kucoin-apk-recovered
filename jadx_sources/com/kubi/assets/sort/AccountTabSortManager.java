package com.kubi.assets.sort;

import com.kubi.assets.AssetsLog;
import com.kubi.assets.C9459a;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.OverviewAccountInfo;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.view.tab.C11296e;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.unify.api.IUnifyAccountService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.assets.sort.k, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AccountTabSortManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u0006J!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\bJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortManager;", "", "<init>", "()V", "supportOrderAccountList", "", "Lcom/kubi/assets/sort/AccountBiz;", "refreshSupportAccounts", "", "isSupportAccount", "", Constants.BIZ, "getSupportAccountList", "", "lastCheckedAccountBiz", "saveOrder", "Lkotlin/Result;", "orders", "Lcom/kubi/assets/sort/AccountTabSortData;", "saveOrder-IoAF18A", "(Ljava/util/List;)Ljava/lang/Object;", "shouldShowSortGuide", "markSortGuideClicked", "buildAccountListFromResponse", "assetOverview", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "createAccountData", "isHide", "isUnified", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAccountTabSortManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountTabSortManager.kt\ncom/kubi/assets/sort/AccountTabSortManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,312:1\n135#2,2:313\n32#2:315\n23#2,2:324\n135#2,2:326\n126#2,2:328\n1#3:316\n774#4:317\n865#4,2:318\n1563#4:320\n1634#4,3:321\n1869#4,2:330\n774#4:332\n865#4,2:333\n1563#4:335\n1634#4,3:336\n774#4:339\n865#4,2:340\n*S KotlinDebug\n*F\n+ 1 AccountTabSortManager.kt\ncom/kubi/assets/sort/AccountTabSortManager\n*L\n77#1:313,2\n122#1:315\n137#1:324,2\n146#1:326,2\n153#1:328,2\n135#1:317\n135#1:318,2\n135#1:320\n135#1:321,3\n172#1:330,2\n267#1:332\n267#1:333,2\n268#1:335\n268#1:336,3\n282#1:339\n282#1:340,2\n*E\n"})
public final class AccountTabSortManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AccountTabSortManager f18789a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final List<AccountBiz> f18790b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<AccountTabSortData> m19358a(@NotNull AssetV2OverviewEntity assetOverview) {
        Intrinsics.checkNotNullParameter(assetOverview, "assetOverview");
        List<OverviewAccountInfo> accounts = assetOverview.getAccounts();
        if (accounts == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (OverviewAccountInfo overviewAccountInfo : accounts) {
            if (overviewAccountInfo.getMain() != null) {
                AccountBiz.C10963e c10963e = AccountBiz.C10963e.f18735b;
                AccountTabSortManager accountTabSortManager = f18789a;
                if (accountTabSortManager.m19361d(c10963e)) {
                    arrayList.add(accountTabSortManager.m19359b(c10963e, assetOverview, false));
                    linkedHashSet.add(c10963e);
                }
            } else if (overviewAccountInfo.getTrade() != null) {
                AccountBiz.C10968j c10968j = AccountBiz.C10968j.f18745b;
                AccountTabSortManager accountTabSortManager2 = f18789a;
                if (accountTabSortManager2.m19361d(c10968j)) {
                    arrayList.add(accountTabSortManager2.m19359b(c10968j, assetOverview, false));
                    linkedHashSet.add(c10968j);
                }
            } else if (overviewAccountInfo.getUnified() != null) {
                AccountBiz.C10969k c10969k = AccountBiz.C10969k.f18747b;
                AccountTabSortManager accountTabSortManager3 = f18789a;
                if (accountTabSortManager3.m19361d(c10969k)) {
                    arrayList.add(accountTabSortManager3.m19359b(c10969k, assetOverview, false));
                    linkedHashSet.add(c10969k);
                }
            } else if (overviewAccountInfo.getMargin() != null) {
                AccountBiz.C10965g c10965g = AccountBiz.C10965g.f18739b;
                AccountTabSortManager accountTabSortManager4 = f18789a;
                if (accountTabSortManager4.m19361d(c10965g)) {
                    arrayList.add(accountTabSortManager4.m19359b(c10965g, assetOverview, false));
                    linkedHashSet.add(c10965g);
                }
            } else if (overviewAccountInfo.getKumex() != null) {
                AccountBiz.C10964f c10964f = AccountBiz.C10964f.f18737b;
                AccountTabSortManager accountTabSortManager5 = f18789a;
                if (accountTabSortManager5.m19361d(c10964f)) {
                    arrayList.add(accountTabSortManager5.m19359b(c10964f, assetOverview, false));
                    linkedHashSet.add(c10964f);
                }
            } else if (overviewAccountInfo.getAlpha() != null) {
                AccountBiz.C10959a c10959a = AccountBiz.C10959a.f18727b;
                AccountTabSortManager accountTabSortManager6 = f18789a;
                if (accountTabSortManager6.m19361d(c10959a)) {
                    arrayList.add(accountTabSortManager6.m19359b(c10959a, assetOverview, false));
                    linkedHashSet.add(c10959a);
                }
            } else if (overviewAccountInfo.getRobot() != null) {
                AccountBiz.C10960b c10960b = AccountBiz.C10960b.f18729b;
                AccountTabSortManager accountTabSortManager7 = f18789a;
                if (accountTabSortManager7.m19361d(c10960b)) {
                    arrayList.add(accountTabSortManager7.m19359b(c10960b, assetOverview, false));
                    linkedHashSet.add(c10960b);
                }
            } else if (overviewAccountInfo.getEarn() != null) {
                AccountBiz.C10962d c10962d = AccountBiz.C10962d.f18733b;
                AccountTabSortManager accountTabSortManager8 = f18789a;
                if (accountTabSortManager8.m19361d(c10962d)) {
                    arrayList.add(accountTabSortManager8.m19359b(c10962d, assetOverview, false));
                    linkedHashSet.add(c10962d);
                }
            } else if (overviewAccountInfo.getOption() != null) {
                AccountBiz.C10967i c10967i = AccountBiz.C10967i.f18743b;
                AccountTabSortManager accountTabSortManager9 = f18789a;
                if (accountTabSortManager9.m19361d(c10967i)) {
                    arrayList.add(accountTabSortManager9.m19359b(c10967i, assetOverview, false));
                    linkedHashSet.add(c10967i);
                }
            } else if (overviewAccountInfo.getCopyTrading() != null) {
                AccountBiz.C10961c c10961c = AccountBiz.C10961c.f18731b;
                AccountTabSortManager accountTabSortManager10 = f18789a;
                if (accountTabSortManager10.m19361d(c10961c)) {
                    arrayList.add(accountTabSortManager10.m19359b(c10961c, assetOverview, false));
                    linkedHashSet.add(c10961c);
                }
            } else if (overviewAccountInfo.getMining() != null) {
                AccountBiz.C10966h c10966h = AccountBiz.C10966h.f18741b;
                AccountTabSortManager accountTabSortManager11 = f18789a;
                if (accountTabSortManager11.m19361d(c10966h)) {
                    arrayList.add(accountTabSortManager11.m19359b(c10966h, assetOverview, false));
                    linkedHashSet.add(c10966h);
                }
            }
        }
        List<AccountBiz> listM19360c = f18789a.m19360c();
        ArrayList<AccountBiz> arrayList2 = new ArrayList();
        for (Object obj : listM19360c) {
            if (!linkedHashSet.contains((AccountBiz) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (AccountBiz accountBiz : arrayList2) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            arrayList3.add(new AccountTabSortData(accountBiz, true, ZERO));
        }
        List<AccountTabSortData> listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3);
        if (!m19362e()) {
            return listPlus;
        }
        Set of2 = SetsKt.setOf((Object[]) new AccountBiz[]{AccountBiz.C10968j.f18745b, AccountBiz.C10964f.f18737b});
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listPlus) {
            AccountTabSortData accountTabSortData = (AccountTabSortData) obj2;
            if (!of2.contains(accountTabSortData.getBiz()) || accountTabSortData.getAssetValue().compareTo(BigDecimal.ZERO) > 0) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    static {
        AccountTabSortManager accountTabSortManager = new AccountTabSortManager();
        f18789a = accountTabSortManager;
        f18790b = new ArrayList();
        accountTabSortManager.m19365h();
    }

    /* JADX INFO: renamed from: b */
    public final AccountTabSortData m19359b(AccountBiz accountBiz, AssetV2OverviewEntity assetV2OverviewEntity, boolean z11) {
        return new AccountTabSortData(accountBiz, z11, C11296e.m20094a(accountBiz.getKey(), assetV2OverviewEntity));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<AccountBiz> m19360c() {
        return CollectionsKt.toList(f18790b);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19361d(@NotNull AccountBiz biz) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        return f18790b.contains(biz);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m19362e() {
        return IUnifyAccountService.f53155a.get().mo64979C();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final AccountBiz m19363f() {
        AccountBiz accountBizFromKey = AccountBiz.f18724a.fromKey(C46392a.m102326h(C42153h.f93593a.m92528r(), ""));
        if (accountBizFromKey == null) {
            accountBizFromKey = AccountBiz.C10963e.f18735b;
        }
        return f18790b.contains(accountBizFromKey) ? accountBizFromKey : AccountBiz.C10963e.f18735b;
    }

    /* JADX INFO: renamed from: g */
    public final void m19364g() {
        C46392a.m102328k(C42153h.f93593a.m92518h(), true);
    }

    /* JADX INFO: renamed from: h */
    public final void m19365h() {
        List<AccountBiz> list = f18790b;
        list.clear();
        list.add(AccountBiz.C10963e.f18735b);
        list.add(AccountBiz.C10968j.f18745b);
        if (C24129b.m58030b(SiteVisibleConfigKey.Margin)) {
            list.add(AccountBiz.C10965g.f18739b);
        }
        if (C9459a.m15238a()) {
            list.add(AccountBiz.C10964f.f18737b);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
            list.add(AccountBiz.C10962d.f18733b);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.CopyTrading)) {
            list.add(AccountBiz.C10961c.f18731b);
        }
        if (AssetsDepend.f18689a.m19185f().mo50712o() && C46392a.m102322d(C42153h.f93593a.m92499C(), false)) {
            list.add(AccountBiz.C10959a.f18727b);
        }
        IUnifyAccountService iUnifyAccountService = IUnifyAccountService.f53155a.get();
        if (C24129b.m58030b(SiteVisibleConfigKey.UNIFIED) && (iUnifyAccountService.mo64979C() || iUnifyAccountService.mo64991e())) {
            list.add(AccountBiz.C10969k.f18747b);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.TradingBot)) {
            list.add(AccountBiz.C10960b.f18729b);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.Option)) {
            list.add(AccountBiz.C10967i.f18743b);
        }
        if (C24129b.m58030b(SiteVisibleConfigKey.CLOUD_MINING)) {
            list.add(AccountBiz.C10966h.f18741b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Object m19366i(@NotNull List<AccountTabSortData> orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        try {
            Result.Companion companion = Result.INSTANCE;
            ArrayList arrayList = new ArrayList();
            for (Object obj : orders) {
                if (!((AccountTabSortData) obj).getIsHide()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AccountTabSortData) it.next()).getBiz().getKey());
            }
            C46392a.m102333p(C42153h.f93593a.m92535y(), CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null));
            AssetsLog.Common.m15236i("保存账户排序顺序: " + arrayList2);
            return Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19367j() {
        return !C46392a.m102322d(C42153h.f93593a.m92518h(), false) && C10997l.m19368a();
    }
}
