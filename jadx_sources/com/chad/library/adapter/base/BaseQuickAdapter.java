package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.chad.library.adapter.base.animation.AlphaInAnimation;
import com.chad.library.adapter.base.animation.ItemAnimator;
import com.chad.library.adapter.base.animation.ScaleInAnimation;
import com.chad.library.adapter.base.animation.SlideInBottomAnimation;
import com.chad.library.adapter.base.animation.SlideInLeftAnimation;
import com.chad.library.adapter.base.animation.SlideInRightAnimation;
import com.chad.library.adapter.base.util.AdapterUtilsKt;
import com.chad.library.adapter.base.viewholder.EmptyLayoutVH;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33954u6;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: BaseQuickAdapter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \u0088\u0001*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u00020\u00030\u0004:\u000e\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010@J\u001f\u0010=\u001a\u00020>2\b\b\u0001\u0010A\u001a\u00020)2\u0006\u0010?\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010BJ \u0010C\u001a\u00020>2\b\b\u0001\u0010A\u001a\u00020)2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016J\u0016\u0010C\u001a\u00020>2\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016J*\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0001\u0010G\u001a\u00020)2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000,J*\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0001\u0010G\u001a\u00020)2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000.J\u000e\u0010J\u001a\u00020>2\u0006\u0010H\u001a\u000205J\u001d\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00028\u00012\u0006\u0010M\u001a\u00020)H\u0014¢\u0006\u0002\u0010NJ\u0006\u0010O\u001a\u00020>J\u0016\u0010P\u001a\u00020\u000b2\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0017\u0010R\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010A\u001a\u00020)¢\u0006\u0002\u0010SJ\u0006\u0010T\u001a\u00020)J\u0016\u0010T\u001a\u00020)2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0014J\u0010\u0010U\u001a\u00020V2\u0006\u0010A\u001a\u00020)H\u0016J\u000e\u0010W\u001a\u00020)2\u0006\u0010A\u001a\u00020)J\u001e\u0010W\u001a\u00020)2\u0006\u0010A\u001a\u00020)2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0014J\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000100J\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000102J\u0010\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020)H\u0016J\u0013\u0010\\\u001a\u00020)2\u0006\u0010]\u001a\u00028\u0000¢\u0006\u0002\u0010^J\u0018\u0010_\u001a\u00020>2\u0006\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020)H\u0016J\u0010\u0010b\u001a\u00020>2\u0006\u00108\u001a\u00020\tH\u0017J'\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00028\u00012\u0006\u0010A\u001a\u00020)2\b\u0010]\u001a\u0004\u0018\u00018\u0000H$¢\u0006\u0002\u0010eJ5\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00028\u00012\u0006\u0010A\u001a\u00020)2\b\u0010]\u001a\u0004\u0018\u00018\u00002\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u0006H\u0014¢\u0006\u0002\u0010hJ\u0016\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00020\u00032\u0006\u0010A\u001a\u00020)J$\u0010c\u001a\u00020>2\u0006\u0010d\u001a\u00020\u00032\u0006\u0010A\u001a\u00020)2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g04J%\u0010i\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010j\u001a\u00020k2\u0006\u0010M\u001a\u00020)H$¢\u0006\u0002\u0010lJ\u0016\u0010i\u001a\u00020\u00032\u0006\u0010j\u001a\u00020k2\u0006\u0010M\u001a\u00020)J\u0010\u0010m\u001a\u00020>2\u0006\u00108\u001a\u00020\tH\u0017J\u0018\u0010n\u001a\u00020>2\u0006\u0010o\u001a\u00020\u00152\u0006\u0010A\u001a\u00020)H\u0014J\u0018\u0010p\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u00152\u0006\u0010A\u001a\u00020)H\u0014J\u0018\u0010q\u001a\u00020>2\u0006\u0010o\u001a\u00020\u00152\u0006\u0010A\u001a\u00020)H\u0014J\u0018\u0010r\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u00152\u0006\u0010A\u001a\u00020)H\u0014J\u0010\u0010s\u001a\u00020>2\u0006\u0010d\u001a\u00020\u0003H\u0017J\u0010\u0010t\u001a\u00020>2\u0006\u0010d\u001a\u00020\u0003H\u0017J\u0015\u0010u\u001a\u00020>2\u0006\u0010?\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010@J\u0012\u0010v\u001a\u00020>2\b\b\u0001\u0010A\u001a\u00020)H\u0016J\u001c\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0001\u0010G\u001a\u00020)J\u001c\u0010x\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0001\u0010G\u001a\u00020)J\u000e\u0010y\u001a\u00020>2\u0006\u0010H\u001a\u000205J\u0010\u0010z\u001a\u00020>2\u0006\u0010d\u001a\u00020\u0003H\u0002J \u0010{\u001a\u00020>2\b\b\u0001\u0010A\u001a\u00020)2\u0006\u0010?\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010BJ\u0018\u0010|\u001a\u00020>2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010}\u001a\u00020)J\u000e\u0010#\u001a\u00020>2\u0006\u0010~\u001a\u00020\u007fJ#\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000100J#\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000102J\u001b\u0010\u0082\u0001\u001a\u00020>2\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0006\u0010d\u001a\u00020\u0003H\u0014J\u0019\u0010\u0085\u0001\u001a\u00020>2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006H\u0016J\u0019\u0010\u0086\u0001\u001a\u00020>2\u0006\u0010`\u001a\u00020)2\u0006\u0010a\u001a\u00020)H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0007R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0011\u00108\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u000b*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006\u008e\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", FirebaseAnalytics.Param.ITEMS, "", "(Ljava/util/List;)V", "_recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "animationEnable", "", "getAnimationEnable", "()Z", "setAnimationEnable", "(Z)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "value", "Landroid/view/View;", "emptyView", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "isAnimationFirstOnly", "setAnimationFirstOnly", "isEmptyViewEnable", "setEmptyViewEnable", "Lcom/chad/library/adapter/base/animation/ItemAnimator;", "itemAnimation", "getItemAnimation", "()Lcom/chad/library/adapter/base/animation/ItemAnimator;", "setItemAnimation", "(Lcom/chad/library/adapter/base/animation/ItemAnimator;)V", "getItems", "()Ljava/util/List;", "setItems", "mLastPosition", "", "mOnItemChildClickArray", "Landroid/util/SparseArray;", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;", "mOnItemChildLongClickArray", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildLongClickListener;", "mOnItemClickListener", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;", "mOnItemLongClickListener", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemLongClickListener;", "mOnViewAttachStateChangeListeners", "", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;", "mutableItems", "getMutableItems", "recyclerView", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "isEmptyViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", "add", "", "data", "(Ljava/lang/Object;)V", ViewProps.POSITION, "(ILjava/lang/Object;)V", "addAll", "collection", "", "addOnItemChildClickListener", "id", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnItemChildLongClickListener", "addOnViewAttachStateChangeListener", "bindViewClickListener", "viewHolder", "viewType", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "clearOnViewAttachStateChangeListener", "displayEmptyView", "list", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "getItemId", "", "getItemViewType", "getOnItemClickListener", "getOnItemLongClickListener", "isFullSpanItem", "itemType", "itemIndexOfFirst", "item", "(Ljava/lang/Object;)I", "move", "fromPosition", "toPosition", "onAttachedToRecyclerView", "onBindViewHolder", C33954u6.f72238i, "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V", "payloads", "", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onDetachedFromRecyclerView", "onItemChildClick", "v", "onItemChildLongClick", "onItemClick", "onItemLongClick", "onViewAttachedToWindow", "onViewDetachedFromWindow", "remove", "removeAt", "removeOnItemChildClickListener", "removeOnItemChildLongClickListener", "removeOnViewAttachStateChangeListener", "runAnimator", "set", "setEmptyViewLayout", "layoutResId", "animationType", "Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "setOnItemClickListener", "setOnItemLongClickListener", "startItemAnimator", "anim", "Landroid/animation/Animator;", "submitList", "swap", "AnimationType", "Companion", "OnItemChildClickListener", "OnItemChildLongClickListener", "OnItemClickListener", "OnItemLongClickListener", "OnViewAttachStateChangeListener", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseQuickAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQuickAdapter.kt\ncom/chad/library/adapter/base/BaseQuickAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n1855#2,2:770\n1855#2,2:772\n350#2,7:774\n1#3:781\n*S KotlinDebug\n*F\n+ 1 BaseQuickAdapter.kt\ncom/chad/library/adapter/base/BaseQuickAdapter\n*L\n268#1:770,2\n275#1:772,2\n411#1:774,7\n*E\n"})
public abstract class BaseQuickAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int EMPTY_PAYLOAD = 0;
    public static final int EMPTY_VIEW = 268436821;

    @Nullable
    private RecyclerView _recyclerView;
    private boolean animationEnable;

    @Nullable
    private View emptyView;
    private boolean isAnimationFirstOnly;
    private boolean isEmptyViewEnable;

    @Nullable
    private ItemAnimator itemAnimation;

    @NotNull
    private List<? extends T> items;
    private int mLastPosition;

    @Nullable
    private SparseArray<OnItemChildClickListener<T>> mOnItemChildClickArray;

    @Nullable
    private SparseArray<OnItemChildLongClickListener<T>> mOnItemChildLongClickArray;

    @Nullable
    private OnItemClickListener<T> mOnItemClickListener;

    @Nullable
    private OnItemLongClickListener<T> mOnItemLongClickListener;

    @Nullable
    private List<OnViewAttachStateChangeListener> mOnViewAttachStateChangeListeners;

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$AnimationType;", "", "(Ljava/lang/String;I)V", "AlphaIn", "ScaleIn", "SlideInBottom", "SlideInLeft", "SlideInRight", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J*\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0002\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildClickListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onItemClick", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnItemChildClickListener<T> {
        void onItemClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position);
    }

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J*\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0002\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemChildLongClickListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onItemLongClick", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnItemChildLongClickListener<T> {
        boolean onItemLongClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position);
    }

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J*\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0002\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onClick", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnItemClickListener<T> {
        void onClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position);
    }

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J*\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0002\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemLongClickListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "onLongClick", "", "adapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", ViewProps.POSITION, "", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnItemLongClickListener<T> {
        boolean onLongClick(@NotNull BaseQuickAdapter<T, ?> adapter, @NotNull View view, int position);
    }

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/chad/library/adapter/base/BaseQuickAdapter$OnViewAttachStateChangeListener;", "", "onViewAttachedToWindow", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onViewDetachedFromWindow", "com.github.CymChad.brvah"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface OnViewAttachStateChangeListener {
        void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder);

        void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseQuickAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public void add(@IntRange(from = 0) int position, T data) {
        if (position <= getItems().size() && position >= 0) {
            if (displayEmptyView$default(this, null, 1, null)) {
                notifyItemRemoved(0);
            }
            getMutableItems().add(position, data);
            notifyItemInserted(position);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
    }

    public void addAll(@IntRange(from = 0) int position, @NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (position > getItems().size() || position < 0) {
            throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
        }
        if (displayEmptyView$default(this, null, 1, null)) {
            notifyItemRemoved(0);
        }
        if (getMutableItems().addAll(position, collection)) {
            notifyItemRangeInserted(position, collection.size());
        }
    }

    public int getItemCount(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    public int getItemViewType(int position, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return 0;
    }

    public abstract void onBindViewHolder(@NotNull VH holder, int position, @Nullable T item);

    public void onBindViewHolder(@NotNull VH holder, int position, @Nullable T item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, position, item);
    }

    @NotNull
    public abstract VH onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup parent, int viewType);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 268436821) {
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new EmptyLayoutVH(frameLayout);
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder = onCreateViewHolder(context, parent, viewType);
        bindViewClickListener(viewHolderOnCreateViewHolder, viewType);
        return viewHolderOnCreateViewHolder;
    }

    public final void setEmptyView(@Nullable View view) {
        boolean zDisplayEmptyView$default = displayEmptyView$default(this, null, 1, null);
        this.emptyView = view;
        boolean zDisplayEmptyView$default2 = displayEmptyView$default(this, null, 1, null);
        if (zDisplayEmptyView$default && !zDisplayEmptyView$default2) {
            notifyItemRemoved(0);
            return;
        }
        if (zDisplayEmptyView$default2 && !zDisplayEmptyView$default) {
            notifyItemInserted(0);
        } else if (zDisplayEmptyView$default && zDisplayEmptyView$default2) {
            notifyItemChanged(0, 0);
        }
    }

    public final void setEmptyViewEnable(boolean z11) {
        boolean zDisplayEmptyView$default = displayEmptyView$default(this, null, 1, null);
        this.isEmptyViewEnable = z11;
        boolean zDisplayEmptyView$default2 = displayEmptyView$default(this, null, 1, null);
        if (zDisplayEmptyView$default && !zDisplayEmptyView$default2) {
            notifyItemRemoved(0);
            return;
        }
        if (zDisplayEmptyView$default2 && !zDisplayEmptyView$default) {
            notifyItemInserted(0);
        } else if (zDisplayEmptyView$default && zDisplayEmptyView$default2) {
            notifyItemChanged(0, 0);
        }
    }

    public final void setItemAnimation(@Nullable ItemAnimator itemAnimator) {
        this.animationEnable = true;
        this.itemAnimation = itemAnimator;
    }

    /* JADX INFO: compiled from: BaseQuickAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            try {
                iArr[AnimationType.AlphaIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationType.ScaleIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnimationType.SlideInRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BaseQuickAdapter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewClickListener$lambda$11$lambda$10$lambda$9(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v11) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(v11, "v");
        this$0.onItemChildClick(v11, bindingAdapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindViewClickListener$lambda$14$lambda$13$lambda$12(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v11) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(v11, "v");
        return this$0.onItemChildLongClick(v11, bindingAdapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewClickListener$lambda$6$lambda$5(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v11) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(v11, "v");
        this$0.onItemClick(v11, bindingAdapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindViewClickListener$lambda$8$lambda$7(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v11) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(v11, "v");
        return this$0.onItemLongClick(v11, bindingAdapterPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean displayEmptyView$default(BaseQuickAdapter baseQuickAdapter, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayEmptyView");
        }
        if ((i11 & 1) != 0) {
            list = baseQuickAdapter.getItems();
        }
        return baseQuickAdapter.displayEmptyView(list);
    }

    private final void runAnimator(RecyclerView.ViewHolder holder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || holder.getLayoutPosition() > this.mLastPosition) {
                ItemAnimator alphaInAnimation = this.itemAnimation;
                if (alphaInAnimation == null) {
                    alphaInAnimation = new AlphaInAnimation(0L, 0.0f, 3, null);
                }
                View view = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                startItemAnimator(alphaInAnimation.animator(view), holder);
                this.mLastPosition = holder.getLayoutPosition();
            }
        }
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> addOnItemChildClickListener(@IdRes int id2, @NotNull OnItemChildClickListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mOnItemChildClickArray == null) {
            this.mOnItemChildClickArray = new SparseArray<>(2);
        }
        SparseArray<OnItemChildClickListener<T>> sparseArray = this.mOnItemChildClickArray;
        Intrinsics.checkNotNull(sparseArray);
        sparseArray.put(id2, listener);
        return this;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> addOnItemChildLongClickListener(@IdRes int id2, @NotNull OnItemChildLongClickListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mOnItemChildLongClickArray == null) {
            this.mOnItemChildLongClickArray = new SparseArray<>(2);
        }
        SparseArray<OnItemChildLongClickListener<T>> sparseArray = this.mOnItemChildLongClickArray;
        Intrinsics.checkNotNull(sparseArray);
        sparseArray.put(id2, listener);
        return this;
    }

    public final void addOnViewAttachStateChangeListener(@NotNull OnViewAttachStateChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.mOnViewAttachStateChangeListeners == null) {
            this.mOnViewAttachStateChangeListeners = new ArrayList();
        }
        List<OnViewAttachStateChangeListener> list = this.mOnViewAttachStateChangeListeners;
        Intrinsics.checkNotNull(list);
        if (list.contains(listener)) {
            return;
        }
        List<OnViewAttachStateChangeListener> list2 = this.mOnViewAttachStateChangeListeners;
        Intrinsics.checkNotNull(list2);
        list2.add(listener);
    }

    public final void clearOnViewAttachStateChangeListener() {
        List<OnViewAttachStateChangeListener> list = this.mOnViewAttachStateChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public final boolean displayEmptyView(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (this.emptyView == null || !this.isEmptyViewEnable) {
            return false;
        }
        return list.isEmpty();
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @Nullable
    public final View getEmptyView() {
        return this.emptyView;
    }

    @Nullable
    public final ItemAnimator getItemAnimation() {
        return this.itemAnimation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (displayEmptyView$default(this, null, 1, null)) {
            return 1;
        }
        return getItemCount(getItems());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int position) {
        return displayEmptyView$default(this, null, 1, null) ? EMPTY_VIEW : getItemViewType(position, getItems());
    }

    @NotNull
    public List<T> getItems() {
        return this.items;
    }

    @Nullable
    public final OnItemClickListener<T> getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Nullable
    public final OnItemLongClickListener<T> getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this._recyclerView;
        if (recyclerView == null) {
            throw new IllegalStateException("Please get it after onAttachedToRecyclerView()");
        }
        Intrinsics.checkNotNull(recyclerView);
        return recyclerView;
    }

    /* JADX INFO: renamed from: isAnimationFirstOnly, reason: from getter */
    public final boolean getIsAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    /* JADX INFO: renamed from: isEmptyViewEnable, reason: from getter */
    public final boolean getIsEmptyViewEnable() {
        return this.isEmptyViewEnable;
    }

    public final boolean isEmptyViewHolder(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        return viewHolder instanceof EmptyLayoutVH;
    }

    public void move(int fromPosition, int toPosition) {
        if (fromPosition < 0 || fromPosition >= getItems().size() || toPosition < 0 || toPosition >= getItems().size()) {
            return;
        }
        getMutableItems().add(toPosition, getMutableItems().remove(fromPosition));
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof EmptyLayoutVH) {
            ((EmptyLayoutVH) holder).changeEmptyView(this.emptyView);
        } else {
            onBindViewHolder(holder, position, getItem(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (isFullSpanItem(getItemViewType(holder.getBindingAdapterPosition()))) {
            AdapterUtilsKt.asStaggeredGridFullSpan(holder);
        } else {
            runAnimator(holder);
        }
        List<OnViewAttachStateChangeListener> list = this.mOnViewAttachStateChangeListeners;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((OnViewAttachStateChangeListener) it.next()).onViewAttachedToWindow(holder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<OnViewAttachStateChangeListener> list = this.mOnViewAttachStateChangeListeners;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((OnViewAttachStateChangeListener) it.next()).onViewDetachedFromWindow(holder);
            }
        }
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> removeOnItemChildClickListener(@IdRes int id2) {
        SparseArray<OnItemChildClickListener<T>> sparseArray = this.mOnItemChildClickArray;
        if (sparseArray != null) {
            sparseArray.remove(id2);
        }
        return this;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> removeOnItemChildLongClickListener(@IdRes int id2) {
        SparseArray<OnItemChildLongClickListener<T>> sparseArray = this.mOnItemChildLongClickArray;
        if (sparseArray != null) {
            sparseArray.remove(id2);
        }
        return this;
    }

    public final void removeOnViewAttachStateChangeListener(@NotNull OnViewAttachStateChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<OnViewAttachStateChangeListener> list = this.mOnViewAttachStateChangeListeners;
        if (list != null) {
            list.remove(listener);
        }
    }

    public final void setAnimationEnable(boolean z11) {
        this.animationEnable = z11;
    }

    public final void setAnimationFirstOnly(boolean z11) {
        this.isAnimationFirstOnly = z11;
    }

    public final void setEmptyViewLayout(@NotNull Context context, @LayoutRes int layoutResId) {
        Intrinsics.checkNotNullParameter(context, "context");
        setEmptyView(LayoutInflater.from(context).inflate(layoutResId, (ViewGroup) new FrameLayout(context), false));
    }

    public void setItems(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> setOnItemClickListener(@Nullable OnItemClickListener<T> listener) {
        this.mOnItemClickListener = listener;
        return this;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> setOnItemLongClickListener(@Nullable OnItemLongClickListener<T> listener) {
        this.mOnItemLongClickListener = listener;
        return this;
    }

    public void startItemAnimator(@NotNull Animator anim, @NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Intrinsics.checkNotNullParameter(holder, "holder");
        anim.start();
    }

    public void submitList(@Nullable List<? extends T> list) {
        List<? extends T> listEmptyList = list == null ? CollectionsKt.emptyList() : list;
        if (list == getItems()) {
            return;
        }
        this.mLastPosition = -1;
        boolean zDisplayEmptyView$default = displayEmptyView$default(this, null, 1, null);
        boolean zDisplayEmptyView = displayEmptyView(listEmptyList);
        if (zDisplayEmptyView$default && !zDisplayEmptyView) {
            setItems(listEmptyList);
            notifyItemRemoved(0);
            notifyItemRangeInserted(0, listEmptyList.size());
        } else if (zDisplayEmptyView && !zDisplayEmptyView$default) {
            notifyItemRangeRemoved(0, getItems().size());
            setItems(listEmptyList);
            notifyItemInserted(0);
        } else if (zDisplayEmptyView$default && zDisplayEmptyView) {
            setItems(listEmptyList);
            notifyItemChanged(0, 0);
        } else {
            setItems(listEmptyList);
            notifyDataSetChanged();
        }
    }

    public void swap(int fromPosition, int toPosition) {
        if (fromPosition < 0 || fromPosition >= getItems().size() || toPosition < 0 || toPosition >= getItems().size()) {
            return;
        }
        Collections.swap(getItems(), fromPosition, toPosition);
        notifyItemChanged(fromPosition);
        notifyItemChanged(toPosition);
    }

    private final List<T> getMutableItems() {
        List<T> items = getItems();
        if (items instanceof ArrayList) {
            List<T> items2 = getItems();
            Intrinsics.checkNotNull(items2, "null cannot be cast to non-null type java.util.ArrayList<T of com.chad.library.adapter.base.BaseQuickAdapter>");
            return (ArrayList) items2;
        }
        if (TypeIntrinsics.isMutableList(items)) {
            List<T> items3 = getItems();
            Intrinsics.checkNotNull(items3, "null cannot be cast to non-null type kotlin.collections.MutableList<T of com.chad.library.adapter.base.BaseQuickAdapter>");
            return TypeIntrinsics.asMutableList(items3);
        }
        List<T> mutableList = CollectionsKt.toMutableList((Collection) getItems());
        setItems(mutableList);
        return mutableList;
    }

    public void bindViewClickListener(@NotNull final VH viewHolder, int viewType) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseQuickAdapter.bindViewClickListener$lambda$6$lambda$5(viewHolder, this, view);
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.c
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BaseQuickAdapter.bindViewClickListener$lambda$8$lambda$7(viewHolder, this, view);
                }
            });
        }
        SparseArray<OnItemChildClickListener<T>> sparseArray = this.mOnItemChildClickArray;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                View viewFindViewById = viewHolder.itemView.findViewById(sparseArray.keyAt(i11));
                if (viewFindViewById != null) {
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById<View>(id)");
                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            BaseQuickAdapter.bindViewClickListener$lambda$11$lambda$10$lambda$9(viewHolder, this, view);
                        }
                    });
                }
            }
        }
        SparseArray<OnItemChildLongClickListener<T>> sparseArray2 = this.mOnItemChildLongClickArray;
        if (sparseArray2 != null) {
            int size2 = sparseArray2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                View viewFindViewById2 = viewHolder.itemView.findViewById(sparseArray2.keyAt(i12));
                if (viewFindViewById2 != null) {
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById<View>(id)");
                    viewFindViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.e
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            return BaseQuickAdapter.bindViewClickListener$lambda$14$lambda$13$lambda$12(viewHolder, this, view);
                        }
                    });
                }
            }
        }
    }

    @NotNull
    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
        return context;
    }

    @Nullable
    public final T getItem(@IntRange(from = 0) int position) {
        return (T) CollectionsKt.getOrNull(getItems(), position);
    }

    public boolean isFullSpanItem(int itemType) {
        if (itemType == 268436821) {
            return true;
        }
        return false;
    }

    public final int itemIndexOfFirst(T item) {
        Iterator<T> it = getItems().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(item, it.next())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this._recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this._recyclerView = null;
    }

    public void onItemChildClick(@NotNull View v11, int position) {
        OnItemChildClickListener<T> onItemChildClickListener;
        Intrinsics.checkNotNullParameter(v11, "v");
        SparseArray<OnItemChildClickListener<T>> sparseArray = this.mOnItemChildClickArray;
        if (sparseArray != null && (onItemChildClickListener = sparseArray.get(v11.getId())) != null) {
            onItemChildClickListener.onItemClick(this, v11, position);
        }
    }

    public boolean onItemChildLongClick(@NotNull View v11, int position) {
        OnItemChildLongClickListener<T> onItemChildLongClickListener;
        Intrinsics.checkNotNullParameter(v11, "v");
        SparseArray<OnItemChildLongClickListener<T>> sparseArray = this.mOnItemChildLongClickArray;
        if (sparseArray != null && (onItemChildLongClickListener = sparseArray.get(v11.getId())) != null) {
            return onItemChildLongClickListener.onItemLongClick(this, v11, position);
        }
        return false;
    }

    public void onItemClick(@NotNull View v11, int position) {
        Intrinsics.checkNotNullParameter(v11, "v");
        OnItemClickListener<T> onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onClick(this, v11, position);
        }
    }

    public boolean onItemLongClick(@NotNull View v11, int position) {
        Intrinsics.checkNotNullParameter(v11, "v");
        OnItemLongClickListener<T> onItemLongClickListener = this.mOnItemLongClickListener;
        if (onItemLongClickListener != null) {
            return onItemLongClickListener.onLongClick(this, v11, position);
        }
        return false;
    }

    public void remove(T data) {
        int iIndexOf = getItems().indexOf(data);
        if (iIndexOf == -1) {
            return;
        }
        removeAt(iIndexOf);
    }

    public void removeAt(@IntRange(from = 0) int position) {
        if (position < getItems().size()) {
            getMutableItems().remove(position);
            notifyItemRemoved(position);
            if (displayEmptyView$default(this, null, 1, null)) {
                notifyItemInserted(0);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
    }

    public void set(@IntRange(from = 0) int position, T data) {
        if (position < getItems().size()) {
            getMutableItems().set(position, data);
            notifyItemChanged(position);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + position + ". size:" + getItems().size());
    }

    public final void setItemAnimation(@NotNull AnimationType animationType) {
        ItemAnimator alphaInAnimation;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i11 = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i11 == 1) {
            alphaInAnimation = new AlphaInAnimation(0L, 0.0f, 3, null);
        } else if (i11 == 2) {
            alphaInAnimation = new ScaleInAnimation(0L, 0.0f, 3, null);
        } else if (i11 == 3) {
            alphaInAnimation = new SlideInBottomAnimation(0L, 1, null);
        } else if (i11 == 4) {
            alphaInAnimation = new SlideInLeftAnimation(0L, 1, null);
        } else {
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            alphaInAnimation = new SlideInRightAnimation(0L, 1, null);
        }
        setItemAnimation(alphaInAnimation);
    }

    public BaseQuickAdapter(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.mLastPosition = -1;
        this.isAnimationFirstOnly = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
        } else if (holder instanceof EmptyLayoutVH) {
            ((EmptyLayoutVH) holder).changeEmptyView(this.emptyView);
        } else {
            onBindViewHolder(holder, position, getItem(position), payloads);
        }
    }

    public void add(T data) {
        if (displayEmptyView$default(this, null, 1, null)) {
            notifyItemRemoved(0);
        }
        if (getMutableItems().add(data)) {
            notifyItemInserted(getItems().size() - 1);
        }
    }

    public void addAll(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (displayEmptyView$default(this, null, 1, null)) {
            notifyItemRemoved(0);
        }
        int size = getItems().size();
        if (getMutableItems().addAll(collection)) {
            notifyItemRangeInserted(size, collection.size());
        }
    }
}
