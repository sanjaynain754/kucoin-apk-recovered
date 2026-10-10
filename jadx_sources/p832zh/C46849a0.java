package p832zh;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.futures.dialog.twap.TimeBreakdown;
import com.kubi.resources.widget.wheel.view.WheelView;
import com.kubi.sdk.res.R$color;
import com.kubi.utils.C27017c;
import com.tencent.bugly.proguard.C33978va;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p293gx.InterfaceC38055a;
import p350ix.InterfaceC40189b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.LongRange;

/* JADX INFO: renamed from: zh.a0 */
/* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\b\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f¨\u0006\u0010"}, m90084d2 = {"init", "", "Lcom/kubi/resources/widget/wheel/view/WheelView;", "current", "", "data", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "secondsToDaysHoursMinutes", "Lcom/kubi/futures/dialog/twap/TimeBreakdown;", "totalSeconds", "", "toLongRange", "Lkotlin/ranges/LongRange;", "Lkotlin/ranges/IntRange;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46849a0 {

    /* JADX INFO: renamed from: zh.a0$a */
    /* JADX INFO: compiled from: TotalTimeSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"com/kubi/futures/dialog/twap/TotalTimeSettingDialogKt$init$1", "Lcom/kubi/resources/widget/wheel/adapter/WheelAdapter;", "", "getItemsCount", "indexOf", "o", "getItem", "index", "(I)Ljava/lang/Integer;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC38055a<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<Integer> f104684a;

        public a(List<Integer> list) {
            this.f104684a = list;
        }

        @Override // p293gx.InterfaceC38055a
        /* JADX INFO: renamed from: a */
        public int mo85927a() {
            return this.f104684a.size();
        }

        @Override // p293gx.InterfaceC38055a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer getItem(int i11) {
            if (i11 < 0 || i11 >= this.f104684a.size()) {
                return null;
            }
            return this.f104684a.get(i11);
        }

        /* JADX INFO: renamed from: c */
        public int m103199c(int i11) {
            return this.f104684a.indexOf(Integer.valueOf(i11));
        }

        @Override // p293gx.InterfaceC38055a
        public /* bridge */ /* synthetic */ int indexOf(Integer num) {
            return m103199c(num.intValue());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m103194b(@NotNull WheelView wheelView, int i11, @NotNull final List<Integer> data, @NotNull final Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(wheelView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        wheelView.setCyclic(false);
        wheelView.setAdapter(new a(data));
        wheelView.setOnItemSelectedListener(new InterfaceC40189b() { // from class: zh.z
            @Override // p350ix.InterfaceC40189b
            /* JADX INFO: renamed from: a */
            public final void mo88537a(int i12) {
                C46849a0.m103195c(listener, data, i12);
            }
        });
        wheelView.setCurrentItem(wheelView.getAdapter().indexOf(Integer.valueOf(i11)));
        wheelView.setLineSpacingMultiplier(2.0f);
        wheelView.setDividerColor(0);
        C27017c c27017c = C27017c.f54310a;
        int i12 = R$color.c_text;
        wheelView.setTextColorCenter(c27017c.m66512a(i12));
        wheelView.setTextColorOut(c27017c.m66512a(i12));
        wheelView.setTextColorOutAlpha(0.4f);
        wheelView.setTextSize(16.0f);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final TimeBreakdown m103196d(long j11) {
        if (j11 < 0) {
            return new TimeBreakdown(0L, 0L, 0L, 0L);
        }
        long j12 = j11 / 86400;
        long j13 = j11 % 86400;
        long j14 = j13 / C33978va.f72340i;
        long j15 = j13 % C33978va.f72340i;
        return new TimeBreakdown(j12, j14, j15 / 60, j15 % 60);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final LongRange m103197e(@NotNull IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return new LongRange(intRange.getFirst(), intRange.getLast());
    }

    /* JADX INFO: renamed from: c */
    public static final void m103195c(Function1 function1, List list, int i11) {
        function1.invoke(list.get(i11));
    }
}
