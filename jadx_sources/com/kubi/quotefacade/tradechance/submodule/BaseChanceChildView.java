package com.kubi.quotefacade.tradechance.submodule;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.tradechance.submodule.BaseChanceChildView;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import mv.InterfaceC42657b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseChanceChildView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H&J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/widget/FrameLayout;", "Lcom/kubi/quotefacade/tradechance/submodule/ITradeChanceChild;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isMoving", "", "hasLoadedInit", "waitEntity", "Ljava/lang/Object;", "updateEntity", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "(Ljava/lang/Object;)V", "onMoveStart", "onMoveStop", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "showEmptyUI", "updateDataUI", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseChanceChildView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseChanceChildView.kt\ncom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public abstract class BaseChanceChildView<T> extends FrameLayout implements InterfaceC42657b {

    /* JADX INFO: renamed from: b */
    public boolean f42635b;

    /* JADX INFO: renamed from: c */
    public boolean f42636c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public T f42637d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseChanceChildView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // mv.InterfaceC42657b
    /* JADX INFO: renamed from: P */
    public void mo53107P() {
        this.f42635b = false;
        T t11 = this.f42637d;
        if (t11 != null) {
            m53113f(t11);
        }
    }

    @Override // mv.InterfaceC42657b
    /* JADX INFO: renamed from: Q */
    public void mo53108Q() {
        this.f42635b = true;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo53111d();

    /* JADX INFO: renamed from: e */
    public abstract void mo53112e(T t11);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseChanceChildView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final Unit m53106g(BaseChanceChildView baseChanceChildView, Object obj) {
        if (baseChanceChildView.f42635b && baseChanceChildView.f42636c) {
            baseChanceChildView.f42637d = obj;
            return Unit.INSTANCE;
        }
        baseChanceChildView.f42637d = null;
        if (obj == 0) {
            baseChanceChildView.mo53111d();
        } else {
            baseChanceChildView.mo53112e(obj);
        }
        baseChanceChildView.f42636c = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m53113f(@Nullable final T t11) {
        C27100x0.m66923d(new Function0() { // from class: mv.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseChanceChildView.m53106g(this.f94396b, t11);
            }
        });
    }

    public /* synthetic */ BaseChanceChildView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BaseChanceChildView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public void mo53109b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo53110c() {
    }
}
