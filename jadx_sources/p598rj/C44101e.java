package p598rj;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.R$color;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.exception.HomeException;
import com.kubi.home.v2.card.C15000n;
import com.kubi.home.v2.card.HomeCardsRepositoryV2;
import com.kubi.home.v2.container.p088ui.CustomGridLayoutManager;
import com.kubi.home.v2.container.p088ui.HandleTouchRecyclerView;
import com.kubi.home.v2.container.p088ui.description.CardDetailBottomSheet;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.InnerViewHolder;
import com.kubi.sdk.ItemCallBack;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p562qj.C43745a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: rj.e */
/* JADX INFO: compiled from: CardAddBottomSheet.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\fJL\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/description/CardAddBottomSheet;", "", "<init>", "()V", "isShowing", "", TIMPushProvider.f75062n, "", "adapter", "Lcom/kubi/home/v2/container/ui/GridAdapter;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "handleAddCard", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cardData", "disableItemTouch", "context", "Lcom/kubi/sdk/BaseActivity;", "dialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "disable", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardAddBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAddBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardAddBottomSheet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,260:1\n774#2:261\n865#2,2:262\n1563#2:264\n1634#2,3:265\n1869#2,2:271\n1#3:268\n47#4,2:269\n*S KotlinDebug\n*F\n+ 1 CardAddBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardAddBottomSheet\n*L\n51#1:261\n51#1:262,2\n57#1:264\n57#1:265,3\n105#1:271,2\n71#1:269,2\n*E\n"})
public final class C44101e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44101e f97359a = new C44101e();

    /* JADX INFO: renamed from: b */
    public static boolean f97360b;

    /* JADX INFO: renamed from: rj.e$a */
    /* JADX INFO: compiled from: CardAddBottomSheet.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"com/kubi/home/v2/container/ui/description/CardAddBottomSheet$disableItemTouch$1", "Lcom/kubi/home/v2/container/ui/HandleTouchRecyclerView$TouchHandler;", "initialX", "", "initialY", "hasMoved", "", "interceptTouchEvent", "e", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onTouchEvent", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCardAddBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAddBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardAddBottomSheet$disableItemTouch$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
    public static final class a implements HandleTouchRecyclerView.InterfaceC15004a {

        /* JADX INFO: renamed from: a */
        public float f97361a;

        /* JADX INFO: renamed from: b */
        public float f97362b;

        /* JADX INFO: renamed from: c */
        public boolean f97363c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f97364d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f97365e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RecyclerView f97366f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C43745a<BaseCardDataV2> f97367g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ BaseActivity f97368h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ DialogFragmentHelper f97369i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Function1<BaseCardDataV2, Unit> f97370j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i11, boolean z11, RecyclerView recyclerView, C43745a<BaseCardDataV2> c43745a, BaseActivity baseActivity, DialogFragmentHelper dialogFragmentHelper, Function1<? super BaseCardDataV2, Unit> function1) {
            this.f97364d = i11;
            this.f97365e = z11;
            this.f97366f = recyclerView;
            this.f97367g = c43745a;
            this.f97368h = baseActivity;
            this.f97369i = dialogFragmentHelper;
            this.f97370j = function1;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m97178d(DialogFragmentHelper dialogFragmentHelper, Function1 function1, BaseCardDataV2 addData) {
            Intrinsics.checkNotNullParameter(addData, "addData");
            dialogFragmentHelper.dismiss();
            function1.invoke(addData);
            return Unit.INSTANCE;
        }

        @Override // com.kubi.home.v2.container.p088ui.HandleTouchRecyclerView.InterfaceC15004a
        /* JADX INFO: renamed from: b */
        public Boolean mo30867b(MotionEvent e11) {
            View viewFindChildViewUnder;
            RecyclerView.ViewHolder childViewHolder;
            BaseCardDataV2 baseCardDataV2;
            Intrinsics.checkNotNullParameter(e11, "e");
            int actionMasked = e11.getActionMasked();
            if (actionMasked == 0) {
                this.f97361a = e11.getX();
                this.f97362b = e11.getY();
                this.f97363c = false;
                return null;
            }
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    return null;
                }
                float fAbs = Math.abs(e11.getX() - this.f97361a);
                float fAbs2 = Math.abs(e11.getY() - this.f97362b);
                int i11 = this.f97364d;
                if (fAbs <= i11 && fAbs2 <= i11) {
                    return null;
                }
                this.f97363c = true;
                return null;
            }
            if (this.f97365e || this.f97363c || (viewFindChildViewUnder = this.f97366f.findChildViewUnder(e11.getX(), e11.getY())) == null || (childViewHolder = this.f97366f.getChildViewHolder(viewFindChildViewUnder)) == null) {
                return null;
            }
            C43745a<BaseCardDataV2> c43745a = this.f97367g;
            BaseActivity baseActivity = this.f97368h;
            final DialogFragmentHelper dialogFragmentHelper = this.f97369i;
            final Function1<BaseCardDataV2, Unit> function1 = this.f97370j;
            List<T> data = c43745a.getData();
            if (data == 0 || (baseCardDataV2 = (BaseCardDataV2) data.get(childViewHolder.getBindingAdapterPosition())) == null) {
                return null;
            }
            CardDetailBottomSheet.f26550a.m30887m(baseCardDataV2, baseActivity, new Function1() { // from class: rj.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C44101e.a.m97178d(dialogFragmentHelper, function1, (BaseCardDataV2) obj);
                }
            });
            return null;
        }

        @Override // com.kubi.home.v2.container.p088ui.HandleTouchRecyclerView.InterfaceC15004a
        /* JADX INFO: renamed from: c */
        public Boolean mo30868c(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: rj.e$b */
    /* JADX INFO: compiled from: CardAddBottomSheet.kt */
    @Metadata(m90083d1 = {"\u0000Q\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"com/kubi/home/v2/container/ui/description/CardAddBottomSheet$show$2$3", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "marginTopPx", "", "fontSize", "", "widthMap", "", "Lkotlin/Pair;", "", "paint", "Landroid/graphics/Paint;", "onDrawOver", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getItemOffsets", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCardAddBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardAddBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardAddBottomSheet$show$2$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n1878#2,3:261\n*S KotlinDebug\n*F\n+ 1 CardAddBottomSheet.kt\ncom/kubi/home/v2/container/ui/description/CardAddBottomSheet$show$2$3\n*L\n130#1:261,3\n*E\n"})
    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: d */
        public final int f97371d = C27040e.m66658b(12);

        /* JADX INFO: renamed from: e */
        public final float f97372e;

        /* JADX INFO: renamed from: f */
        public final Map<Integer, Pair<String, Float>> f97373f;

        /* JADX INFO: renamed from: g */
        public final Paint f97374g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f97375h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f97376i;

        public b(Context context, c cVar, boolean z11, float f11, int i11, int i12) {
            this.f97375h = i11;
            this.f97376i = i12;
            float fM66660d = C27040e.m66660d(12);
            this.f97372e = fM66660d;
            this.f97373f = new LinkedHashMap();
            Paint paint = new Paint(1);
            paint.setTextSize(fM66660d);
            paint.setColor(ContextCompat.getColor(context, R$color.c_text));
            List<BaseCardDataV2> data = cVar.getData();
            if (data != null) {
                int i13 = 0;
                for (Object obj : data) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BaseCardDataV2 baseCardDataV2 = (BaseCardDataV2) obj;
                    Map<Integer, Pair<String, Float>> map = this.f97373f;
                    Integer numValueOf = Integer.valueOf(i13);
                    String title = baseCardDataV2.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    map.put(numValueOf, TuplesKt.m90091to(title, Float.valueOf(paint.measureText(baseCardDataV2.getTitle()))));
                    i13 = i14;
                }
            }
            if (z11) {
                paint.setAlpha((int) (255 * f11));
            }
            this.f97374g = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int i11 = this.f97375h;
            outRect.left = i11;
            outRect.right = i11;
            outRect.top = this.f97376i;
            outRect.bottom = (int) (this.f97371d + this.f97372e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas c11, RecyclerView parent, RecyclerView.State state) {
            int childAdapterPosition;
            Pair<String, Float> pair;
            Intrinsics.checkNotNullParameter(c11, "c");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int childCount = parent.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = parent.getChildAt(i11);
                if (childAt != null && (childAdapterPosition = parent.getChildAdapterPosition(childAt)) != -1 && (pair = this.f97373f.get(Integer.valueOf(childAdapterPosition))) != null) {
                    String first = pair.getFirst();
                    float fFloatValue = pair.getSecond().floatValue();
                    float width = childAt.getWidth();
                    if (fFloatValue > width && first.length() > 0) {
                        TextPaint textPaint = new TextPaint(this.f97374g);
                        first = TextUtils.ellipsize(first, textPaint, width, TextUtils.TruncateAt.END).toString();
                        fFloatValue = textPaint.measureText(first);
                    }
                    c11.drawText(first, ((childAt.getLeft() + childAt.getRight()) / 2.0f) - (fFloatValue / 2.0f), childAt.getBottom() + this.f97371d + this.f97372e, this.f97374g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: rj.e$c */
    /* JADX INFO: compiled from: CardAddBottomSheet.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/home/v2/container/ui/description/CardAddBottomSheet$show$2$adapter$1", "Lcom/kubi/home/v2/container/ui/GridAdapter;", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "onBindViewHolder", "", C33954u6.f72238i, "Lcom/kubi/sdk/InnerViewHolder;", ViewProps.POSITION, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends C43745a<BaseCardDataV2> {

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ boolean f97377y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ float f97378z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<BaseCardDataV2> list, boolean z11, float f11, SparseArray<Class<?>> sparseArray, SparseArray<ItemCallBack<?>> sparseArray2, SparseArray<ItemCallBack<?>> sparseArray3) {
            super(list, sparseArray, sparseArray2, sparseArray3, null, null, 48, null);
            this.f97377y = z11;
            this.f97378z = f11;
        }

        @Override // com.kubi.sdk.BaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l */
        public void onBindViewHolder(InnerViewHolder<BaseCardDataV2> holder, int i11) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            super.onBindViewHolder(holder, i11);
            if (this.f97377y) {
                holder.itemView.setAlpha(this.f97378z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m97172f(int i11, int i12, Context context, boolean z11, List list, Function1 function1, int i13, float f11, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.itemView.setMinimumHeight(i11);
        viewHolder.itemView.setMinimumWidth(i12);
        ((TextView) viewHolder.getView(R$id.title)).setText(context.getString(R$string.homepage_add_widget));
        if (z11) {
            TextView textView = (TextView) viewHolder.getView(R$id.content);
            textView.setText(textView.getResources().getString(R$string.homepage_max_limit_tips, String.valueOf(i13)));
            textView.setVisibility(0);
        }
        View view = viewHolder.getView(R$id.close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: rj.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44101e.m97173g(dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.empty);
        if (list.isEmpty()) {
            view2.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        SparseArray sparseArray = new SparseArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseCardDataV2 baseCardDataV2 = (BaseCardDataV2) it.next();
            sparseArray.put(baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a());
        }
        c cVar = new c(list, z11, f11, sparseArray, new SparseArray(), new SparseArray());
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new CustomGridLayoutManager(context, 2, cVar));
        int iM66658b = C27040e.m66658b(24);
        int iM66658b2 = C27040e.m66658b(6);
        int i14 = -iM66658b2;
        recyclerView.setPadding(i14, 0, i14, C27040e.m66658b(36));
        recyclerView.setClipToPadding(false);
        recyclerView.addItemDecoration(new b(context, cVar, z11, f11, iM66658b2, iM66658b));
        Intrinsics.checkNotNull(recyclerView);
        f97359a.m97175d((BaseActivity) context, dialogFragmentHelper, recyclerView, cVar, function1, z11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m97174h(DialogInterface dialogInterface) {
        f97360b = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m97176e(@Nullable C43745a<BaseCardDataV2> c43745a, @NotNull final Function1<? super BaseCardDataV2, Unit> handleAddCard) {
        RecyclerView f96711w;
        final Context context;
        FragmentManager supportFragmentManager;
        Collection data;
        List<CardListRspV2.AppWidgetConfigVO> allWidgetList;
        BaseCardDataV2 baseCardDataV2M30814d;
        Intrinsics.checkNotNullParameter(handleAddCard, "handleAddCard");
        if (f97360b || c43745a == null || (f96711w = c43745a.getF96711w()) == null || (context = f96711w.getContext()) == null) {
            return;
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        if (baseActivity == null || (supportFragmentManager = baseActivity.getSupportFragmentManager()) == null || (data = c43745a.getData()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((BaseCardDataV2) obj).getDraggable()) {
                arrayList.add(obj);
            }
        }
        CardListRspV2 cardListRspV2M30792i = HomeCardsRepositoryV2.f26494a.m30792i();
        if (cardListRspV2M30792i == null || (allWidgetList = cardListRspV2M30792i.getAllWidgetList()) == null) {
            return;
        }
        final int maxEditWidgetNum = cardListRspV2M30792i.getMaxEditWidgetNum();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((BaseCardDataV2) it.next()).getCode());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        boolean z11 = arrayList.size() >= maxEditWidgetNum;
        final ArrayList arrayList3 = new ArrayList();
        for (CardListRspV2.AppWidgetConfigVO appWidgetConfigVO : allWidgetList) {
            try {
                if (!appWidgetConfigVO.isFixed() && (appWidgetConfigVO.getRepeatable() || !set.contains(appWidgetConfigVO.getCode()))) {
                    String str = (String) CollectionsKt.firstOrNull((List) appWidgetConfigVO.getStyle());
                    if (str != null && (baseCardDataV2M30814d = C15000n.m30814d(appWidgetConfigVO, str)) != null) {
                        arrayList3.add(baseCardDataV2M30814d);
                    }
                }
            } catch (Exception e11) {
                C43846g.m96568c(new HomeException(e11, "WidgetException", false, null, 8, null), null, 2, null);
            }
        }
        final int iM6183e = C5267e0.m6183e();
        final int iM6182d = (int) (C5267e0.m6182d() * 0.8f);
        final float f11 = 0.5f;
        final boolean z12 = z11;
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.home_card_add_bottom_sheet, 0, 0, iM6182d, true, true, false, false, false, 454, null).m54237f4(new Function2() { // from class: rj.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return C44101e.m97172f(iM6182d, iM6183e, context, z12, arrayList3, handleAddCard, maxEditWidgetNum, f11, (BaseViewHolder) obj2, (DialogFragmentHelper) obj3);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: rj.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C44101e.m97174h(dialogInterface);
            }
        }).show(supportFragmentManager, "CardAddBottomSheet");
        f97360b = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "addWidget", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m97173g(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m97175d(BaseActivity baseActivity, DialogFragmentHelper dialogFragmentHelper, RecyclerView recyclerView, C43745a<BaseCardDataV2> c43745a, Function1<? super BaseCardDataV2, Unit> function1, boolean z11) {
        HandleTouchRecyclerView handleTouchRecyclerView;
        int scaledTouchSlop = ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop() + 5;
        if (recyclerView instanceof HandleTouchRecyclerView) {
            handleTouchRecyclerView = (HandleTouchRecyclerView) recyclerView;
        } else {
            handleTouchRecyclerView = null;
        }
        if (handleTouchRecyclerView != null) {
            handleTouchRecyclerView.setTouchHandler(new a(scaledTouchSlop, z11, recyclerView, c43745a, baseActivity, dialogFragmentHelper, function1));
        }
    }
}
