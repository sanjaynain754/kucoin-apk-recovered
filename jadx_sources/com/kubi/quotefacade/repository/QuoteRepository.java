package com.kubi.quotefacade.repository;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.kubi.quotefacade.entity.Letter;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p844zu.InterfaceC46925b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.kubi.quotefacade.repository.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: QuoteRepository.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0002\u0010\u0016R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/quotefacade/repository/QuoteRepository;", "", "<init>", "()V", "api", "Lcom/kubi/quotefacade/api/IQuoteApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/quotefacade/api/IQuoteApi;", "api$delegate", "Lkotlin/Lazy;", "getCardBusinessIdList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/quotefacade/entity/Letter;", "cardGroupIdList", "", "gmtCreated", "", DevicePublicKeyStringDef.DIRECT, "", "pageSize", "(Ljava/lang/String;Ljava/lang/Long;II)Lio/reactivex/Observable;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f42591a = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.repository.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteRepository.m53012b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final InterfaceC46925b m53013c() {
        return (InterfaceC46925b) this.f42591a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC46925b m53012b() {
        return (InterfaceC46925b) C42597a.m93386b().create(InterfaceC46925b.class);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Observable<BaseEntity<Letter>> m53014d(@Nullable String str, @Nullable Long l11, int i11, int i12) {
        return m53013c().m103346C(str, l11, i11, i12);
    }
}
