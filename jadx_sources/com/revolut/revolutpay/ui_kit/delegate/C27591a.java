package com.revolut.revolutpay.ui_kit.delegate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.ui_kit.delegate.C27591a;
import com.revolut.revolutpay.ui_kit.widget.C27599a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import ra0.AbstractC43963a;
import ra0.InterfaceC43964b;
import xa0.InterfaceC46115a;
import xa0.InterfaceC46117c;
import xa0.InterfaceC46118d;

/* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27591a implements InterfaceC43964b<b, c> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public Function1<? super b, Unit> f56368a = d.f56378a;

    /* JADX INFO: renamed from: b */
    public final int f56369b = R$layout.internal_row_widget;

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a$a */
    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a$a$a, reason: collision with other inner class name */
        public static final class C46986a extends a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final InterfaceC46117c f56370a;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C46986a) && Intrinsics.areEqual(mo68502a(), ((C46986a) obj).mo68502a());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C46986a(@NotNull InterfaceC46117c image) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.f56370a = image;
            }

            @Override // com.revolut.revolutpay.ui_kit.delegate.C27591a.a
            @NotNull
            /* JADX INFO: renamed from: a */
            public InterfaceC46117c mo68502a() {
                return this.f56370a;
            }

            @NotNull
            public String toString() {
                return "Image24(image=" + mo68502a() + ')';
            }

            public int hashCode() {
                return mo68502a().hashCode();
            }
        }

        /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public final InterfaceC46117c f56371a;

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(mo68502a(), ((b) obj).mo68502a());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull InterfaceC46117c image) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.f56371a = image;
            }

            @Override // com.revolut.revolutpay.ui_kit.delegate.C27591a.a
            @NotNull
            /* JADX INFO: renamed from: a */
            public InterfaceC46117c mo68502a() {
                return this.f56371a;
            }

            @NotNull
            public String toString() {
                return "Image40(image=" + mo68502a() + ')';
            }

            public int hashCode() {
                return mo68502a().hashCode();
            }
        }

        public a() {
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC46117c mo68502a();

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a$b */
    public static final class b implements InterfaceC46118d {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f56372a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final InterfaceC46115a f56373b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final InterfaceC46115a f56374c;

        /* JADX INFO: renamed from: d */
        @NotNull
        public final a f56375d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final InterfaceC46117c f56376e;

        public b(@NotNull String listId, @NotNull InterfaceC46115a title, @Nullable InterfaceC46115a interfaceC46115a, @NotNull a mainImage, @Nullable InterfaceC46117c interfaceC46117c) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(mainImage, "mainImage");
            this.f56372a = listId;
            this.f56373b = title;
            this.f56374c = interfaceC46115a;
            this.f56375d = mainImage;
            this.f56376e = interfaceC46117c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(mo68503a(), bVar.mo68503a()) && Intrinsics.areEqual(this.f56373b, bVar.f56373b) && Intrinsics.areEqual(this.f56374c, bVar.f56374c) && Intrinsics.areEqual(this.f56375d, bVar.f56375d) && Intrinsics.areEqual(this.f56376e, bVar.f56376e);
        }

        public /* synthetic */ b(String str, InterfaceC46115a interfaceC46115a, InterfaceC46115a interfaceC46115a2, a aVar, InterfaceC46117c interfaceC46117c, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, interfaceC46115a, (i11 & 4) != 0 ? null : interfaceC46115a2, aVar, (i11 & 16) != 0 ? null : interfaceC46117c);
        }

        @Override // xa0.InterfaceC46118d
        @NotNull
        /* JADX INFO: renamed from: a */
        public String mo68503a() {
            return this.f56372a;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final InterfaceC46117c m68504b() {
            return this.f56376e;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m68505c() {
            return this.f56375d;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final InterfaceC46115a m68506d() {
            return this.f56374c;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final InterfaceC46115a m68507e() {
            return this.f56373b;
        }

        @NotNull
        public String toString() {
            return "Model(listId=" + mo68503a() + ", title=" + this.f56373b + ", subtitle=" + this.f56374c + ", mainImage=" + this.f56375d + ", badgeImage=" + this.f56376e + ')';
        }

        public int hashCode() {
            int iHashCode;
            int iHashCode2 = ((mo68503a().hashCode() * 31) + this.f56373b.hashCode()) * 31;
            InterfaceC46115a interfaceC46115a = this.f56374c;
            int iHashCode3 = 0;
            if (interfaceC46115a == null) {
                iHashCode = 0;
            } else {
                iHashCode = interfaceC46115a.hashCode();
            }
            int iHashCode4 = (((iHashCode2 + iHashCode) * 31) + this.f56375d.hashCode()) * 31;
            InterfaceC46117c interfaceC46117c = this.f56376e;
            if (interfaceC46117c != null) {
                iHashCode3 = interfaceC46117c.hashCode();
            }
            return iHashCode4 + iHashCode3;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a$c */
    public static final class c extends AbstractC43963a<b> {

        /* JADX INFO: renamed from: g */
        @NotNull
        public final C27599a f56377g;

        /* JADX INFO: renamed from: a */
        public final void m68508a(@NotNull View.OnClickListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f56377g.setOnClickListener(listener);
        }

        /* JADX INFO: renamed from: b */
        public void m68509b(@NotNull b item) {
            C27599a c27599a;
            int i11;
            Intrinsics.checkNotNullParameter(item, "item");
            this.f56377g.setTitle$revolut_pay_sdk_2_0_release(item.m68507e());
            this.f56377g.setSubtitle$revolut_pay_sdk_2_0_release(item.m68506d());
            a aVarM68505c = item.m68505c();
            if (!(aVarM68505c instanceof a.b)) {
                if (aVarM68505c instanceof a.C46986a) {
                    c27599a = this.f56377g;
                    i11 = 24;
                }
                this.f56377g.setMainImage$revolut_pay_sdk_2_0_release(item.m68505c().mo68502a());
                this.f56377g.setBadgeImage$revolut_pay_sdk_2_0_release(item.m68504b());
            }
            c27599a = this.f56377g;
            i11 = 40;
            c27599a.setImageSize$revolut_pay_sdk_2_0_release(i11);
            this.f56377g.setMainImage$revolut_pay_sdk_2_0_release(item.m68505c().mo68502a());
            this.f56377g.setBadgeImage$revolut_pay_sdk_2_0_release(item.m68504b());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull C27599a rowWidget) {
            super(rowWidget);
            Intrinsics.checkNotNullParameter(rowWidget, "rowWidget");
            this.f56377g = rowWidget;
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui_kit.delegate.a$d */
    public static final class d extends Lambda implements Function1<b, Unit> {

        /* JADX INFO: renamed from: a */
        public static final d f56378a = new d();

        public d() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m68510a(@NotNull b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b bVar) {
            m68510a(bVar);
            return Unit.INSTANCE;
        }
    }

    @Override // ra0.InterfaceC43964b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo68498a(@NotNull c holder, @NotNull final b data, int i11) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        holder.m68509b(data);
        holder.m68508a(new View.OnClickListener() { // from class: ta0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27591a.m68497d(this.f101276b, data, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m68500e(@NotNull Function1<? super b, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f56368a = function1;
    }

    /* JADX INFO: renamed from: d */
    public static final void m68497d(C27591a this$0, b data, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        this$0.f56368a.invoke(data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: f */
    public c m68501f(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        C27599a c27599a = new C27599a(context, null, 2, 0 == true ? 1 : 0);
        c27599a.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        return new c(c27599a);
    }
}
