package ua0;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.revolut.revolutpay.R$color;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import va0.C45485a;
import wa0.C45780a;
import xa0.C46116b;

/* JADX INFO: renamed from: ua0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C45144a {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final a f101588b = new a(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final C46116b f101589a;

    /* JADX INFO: renamed from: ua0.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C45144a(@NotNull C46116b image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f101589a = image;
    }

    /* JADX INFO: renamed from: a */
    public final C45485a m99783a(Context context, String str) {
        C45485a c45485a = new C45485a(str, C45780a.m101104d(context, R$color.internalRevolutPayUiKit_foreground), 16.0f, 40);
        c45485a.m100447a(C45780a.m101104d(context, R$color.internalRevolutPayUiKit_greyTone20));
        return c45485a;
    }

    /* JADX INFO: renamed from: b */
    public final void m99784b(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        String str = String.format("https://assets.revolut.com/assets/flags/%s.webp", Arrays.copyOf(new Object[]{this.f101589a.m101622a()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "imageView.context");
        C45485a c45485aM99783a = m99783a(context, this.f101589a.m101622a());
        ComponentCallbacks2C5309c.m6557u(imageView).mo6634v(str).mo92190c0(c45485aM99783a).mo92210n(c45485aM99783a).m6594E0(imageView);
    }
}
