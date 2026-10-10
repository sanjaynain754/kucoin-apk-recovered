package com.revolut.revolutpay.data;

import com.revolut.revolutpay.api.OrderState;
import com.revolut.revolutpay.api.UnknownPaymentStateException;
import com.revolut.revolutpay.api.exceptions.SessionException;
import com.revolut.revolutpay.factory.C27528a;
import ja0.C40360b;
import ja0.C40361c;
import ja0.C40363e;
import ja0.InterfaceC40362d;
import java.io.IOException;
import ma0.C42499c;
import oa0.C43005a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import retrofit2.Response;

/* JADX INFO: renamed from: com.revolut.revolutpay.data.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27524a implements InterfaceC40362d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27524a f55949a = new C27524a();

    /* JADX INFO: renamed from: com.revolut.revolutpay.data.a$a */
    public static final class a extends Lambda implements Function1<SessionDto, C42499c> {

        /* JADX INFO: renamed from: a */
        public static final a f55950a = new a();

        public a() {
            super(1);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C42499c invoke(@Nullable SessionDto sessionDto) throws SessionException {
            C42499c c42499cM88947a;
            if (sessionDto == null || (c42499cM88947a = C40363e.m88947a(sessionDto)) == null) {
                throw new SessionException();
            }
            return c42499cM88947a;
        }
    }

    @Override // ja0.InterfaceC40362d
    @NotNull
    /* JADX INFO: renamed from: a */
    public OrderState mo68204a(@NotNull String orderToken) throws IOException, UnknownPaymentStateException {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Response<OrderStateDto> responseExecute = C27528a.f56183a.m68227d().m88944a(orderToken).execute();
        if (responseExecute.isSuccessful()) {
            OrderStateDto orderStateDtoBody = responseExecute.body();
            if (orderStateDtoBody != null) {
                Intrinsics.checkNotNullExpressionValue(orderStateDtoBody, "body()");
                OrderState orderStateM88946a = C40361c.m88946a(orderStateDtoBody);
                if (orderStateM88946a != null) {
                    return orderStateM88946a;
                }
            }
            throw new UnknownPaymentStateException();
        }
        throw new UnknownPaymentStateException();
    }

    /* JADX INFO: renamed from: b */
    public void m68205b(@NotNull String orderToken, @NotNull Function1<? super C42499c, Unit> onSuccess, @NotNull Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        C27528a.f56183a.m68227d().m88945b("Bearer " + C43005a.f95164a.m94439e(), orderToken).enqueue(new C40360b(a.f55950a, onSuccess, onError));
    }
}
