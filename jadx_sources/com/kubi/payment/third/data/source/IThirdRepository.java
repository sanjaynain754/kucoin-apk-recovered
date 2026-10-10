package com.kubi.payment.third.data.source;

import androidx.annotation.WorkerThread;
import com.kubi.otc.entity.FiatUserInfo;
import com.kubi.payment.third.data.entities.ThirdKycInfo;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.third.data.entities.ThirdOrderRequest;
import com.kubi.payment.third.data.entities.ThirdQuoteInfo;
import com.kubi.payment.third.data.entities.ThirdQuoteRequest;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.kubi.payment.third.data.source.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IThirdRepository.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014H§@¢\u0006\u0002\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/third/data/source/IThirdRepository;", "", "loadUserInfo", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/otc/entity/FiatUserInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCheckKycExist", "Lcom/kubi/payment/third/data/entities/ThirdKycInfo;", "loadQuoteThirdInfo", "Lcom/kubi/payment/third/data/entities/ThirdQuoteInfo;", "quoteRequest", "Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;", "(Lcom/kubi/payment/third/data/entities/ThirdQuoteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCreateOrder", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", "orderRequest", "Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;", "(Lcom/kubi/payment/third/data/entities/ThirdOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadCompleteKycInfo", ReportDataTable.COLUMN_PARAMS, "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IThirdRepository {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo49540a(@NotNull Continuation<? super AbstractC42878k<FiatUserInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo49541b(@NotNull Continuation<? super AbstractC42878k<ThirdKycInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo49542c(@NotNull Map<String, String> map, @NotNull Continuation<? super AbstractC42878k<? extends Object>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: d */
    Object mo49543d(@NotNull ThirdQuoteRequest thirdQuoteRequest, @NotNull Continuation<? super AbstractC42878k<ThirdQuoteInfo>> continuation);

    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo49544e(@NotNull ThirdOrderRequest thirdOrderRequest, @NotNull Continuation<? super AbstractC42878k<ThirdOrder>> continuation);
}
