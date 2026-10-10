package com.kubi.resources.widget.drop;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27047f;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.functions.Consumer;
import java.util.List;

/* JADX INFO: renamed from: com.kubi.resources.widget.drop.a */
/* JADX INFO: compiled from: DropMenuHelper.java */
/* JADX INFO: loaded from: classes13.dex */
public class C23034a {

    /* JADX INFO: renamed from: a */
    public TextView f44547a;

    /* JADX INFO: renamed from: b */
    public DropMenuView f44548b;

    /* JADX INFO: renamed from: c */
    public Consumer<Boolean> f44549c;

    /* JADX INFO: renamed from: d */
    public Consumer<Boolean> f44550d;

    /* JADX INFO: renamed from: e */
    public int f44551e = R$color.c_text;

    /* JADX INFO: renamed from: com.kubi.resources.widget.drop.a$a */
    /* JADX INFO: compiled from: DropMenuHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f44552a;

        /* JADX INFO: renamed from: b */
        public String f44553b;

        /* JADX INFO: renamed from: c */
        public FilterType.InterfaceC23033b[] f44554c;

        /* JADX INFO: renamed from: d */
        public Consumer<Integer> f44555d;

        /* JADX INFO: renamed from: e */
        public int f44556e;

        public a(String str, FilterType.InterfaceC23033b[] interfaceC23033bArr) {
            this.f44556e = 3;
            this.f44553b = str;
            for (int i11 = 0; i11 < interfaceC23033bArr.length; i11++) {
                if (i11 == 0) {
                    interfaceC23033bArr[0].mo55155c(true);
                } else {
                    interfaceC23033bArr[i11].mo55155c(false);
                }
            }
            this.f44554c = interfaceC23033bArr;
        }

        /* JADX INFO: renamed from: a */
        public Consumer<Integer> m55167a() {
            return this.f44555d;
        }

        /* JADX INFO: renamed from: b */
        public FilterType.InterfaceC23033b[] m55168b() {
            return this.f44554c;
        }

        /* JADX INFO: renamed from: c */
        public String m55169c() {
            return this.f44553b;
        }

        /* JADX INFO: renamed from: d */
        public int m55170d() {
            return this.f44556e;
        }

        public a(String str, FilterType.InterfaceC23033b[] interfaceC23033bArr, Consumer<Integer> consumer, Boolean bool) {
            this.f44556e = 3;
            this.f44553b = str;
            this.f44555d = consumer;
            if (bool.booleanValue()) {
                for (int i11 = 0; i11 < interfaceC23033bArr.length; i11++) {
                    if (i11 == 0) {
                        interfaceC23033bArr[0].mo55155c(true);
                    } else {
                        interfaceC23033bArr[i11].mo55155c(false);
                    }
                }
            }
            this.f44554c = interfaceC23033bArr;
        }

        public a(String str, FilterType.InterfaceC23033b[] interfaceC23033bArr, int i11) {
            this.f44553b = str;
            this.f44556e = i11;
            for (int i12 = 0; i12 < interfaceC23033bArr.length; i12++) {
                if (i12 == 0) {
                    interfaceC23033bArr[0].mo55155c(true);
                } else {
                    interfaceC23033bArr[i12].mo55155c(false);
                }
            }
            this.f44554c = interfaceC23033bArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m55160d(TextView textView, DropMenuView dropMenuView) {
        m55161e(textView, dropMenuView, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m55157a(C23034a c23034a, Boolean bool) throws Exception {
        Consumer<Boolean> consumer = c23034a.f44549c;
        if (consumer != null) {
            consumer.accept(bool);
        }
        TextView textView = c23034a.f44547a;
        textView.setTextColor(textView.getResources().getColor(bool.booleanValue() ? R$color.primary : c23034a.f44551e));
        c23034a.f44547a.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C27047f.f54334a.m66713b(R$drawable.ic_triangle_bottom_12, Integer.valueOf(bool.booleanValue() ? 180 : 0), Integer.valueOf(bool.booleanValue() ? R$color.primary : R$color.c_icon60), null, null), (Drawable) null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m55158b(C23034a c23034a, Boolean bool) throws Exception {
        Consumer<Boolean> consumer = c23034a.f44550d;
        if (consumer != null) {
            consumer.accept(bool);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m55161e(TextView textView, final DropMenuView dropMenuView, boolean z11) {
        this.f44547a = textView;
        C27014a1.m66505e(textView, R$drawable.ic_triangle_bottom_12, 5, C5275i0.m6236a(2.0f));
        C27046k.m66702q(this.f44547a, C27017c.f54310a.m66512a(R$color.c_icon60));
        this.f44548b = dropMenuView;
        if (z11) {
            this.f44547a.setOnClickListener(new View.OnClickListener() { // from class: uw.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C23034a.m55159c(dropMenuView, view);
                }
            });
        }
        this.f44548b.setShowCallBack(new Consumer() { // from class: uw.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C23034a.m55157a(this.f101909b, (Boolean) obj);
            }
        });
        this.f44548b.setResetCallBack(new Consumer() { // from class: uw.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                C23034a.m55158b(this.f101910b, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public void m55162f() {
        DropMenuView dropMenuView = this.f44548b;
        if (dropMenuView != null) {
            dropMenuView.m55141d();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m55163g() {
        DropMenuView dropMenuView = this.f44548b;
        if (dropMenuView != null) {
            return dropMenuView.m55143f();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m55164h(List<a> list, Consumer<List<FilterType.InterfaceC23033b>> consumer) {
        DropMenuView dropMenuView = this.f44548b;
        if (dropMenuView != null) {
            dropMenuView.m55141d();
            this.f44548b.m55140c(this.f44547a.getContext(), list, consumer);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m55165i(int i11) {
        this.f44551e = i11;
    }

    /* JADX INFO: renamed from: j */
    public void m55166j(Consumer<Boolean> consumer) {
        this.f44549c = consumer;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m55159c(DropMenuView dropMenuView, View view) {
        if (C27014a1.m66501a(view)) {
            return;
        }
        dropMenuView.m55148k();
    }
}
