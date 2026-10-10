package io.chad.library.adapter.base;

import android.util.SparseArray;
import android.view.View;
import androidx.annotation.Nullable;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.provider.BaseItemProvider;
import io.chad.library.adapter.base.util.MultiTypeDelegate;
import io.chad.library.adapter.base.util.ProviderDelegate;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public abstract class MultipleItemRvAdapter<T, V extends BaseViewHolder> extends BaseQuickAdapter<T, V> {
    private SparseArray<BaseItemProvider> mItemProviders;
    protected ProviderDelegate mProviderDelegate;

    public abstract int getViewType(T t11);

    public abstract void registerItemProvider();

    public void finishInitialize() {
        this.mProviderDelegate = new ProviderDelegate();
        setMultiTypeDelegate(new MultiTypeDelegate<T>() { // from class: io.chad.library.adapter.base.MultipleItemRvAdapter.1
            @Override // io.chad.library.adapter.base.util.MultiTypeDelegate
            public int getItemType(T t11) {
                return MultipleItemRvAdapter.this.getViewType(t11);
            }
        });
        registerItemProvider();
        this.mItemProviders = this.mProviderDelegate.getItemProviders();
        for (int i11 = 0; i11 < this.mItemProviders.size(); i11++) {
            int iKeyAt = this.mItemProviders.keyAt(i11);
            BaseItemProvider baseItemProvider = this.mItemProviders.get(iKeyAt);
            baseItemProvider.mData = this.mData;
            getMultiTypeDelegate().registerItemType(iKeyAt, baseItemProvider.layout());
        }
    }

    public MultipleItemRvAdapter(@Nullable List<T> list) {
        super(list);
    }

    private void bindClick(V v11, T t11, int i11, BaseItemProvider baseItemProvider) {
        final V v12;
        final T t12;
        final int i12;
        final BaseItemProvider baseItemProvider2;
        BaseQuickAdapter.OnItemClickListener onItemClickListener = getOnItemClickListener();
        BaseQuickAdapter.OnItemLongClickListener onItemLongClickListener = getOnItemLongClickListener();
        if (onItemClickListener == null || onItemLongClickListener == null) {
            View view = v11.itemView;
            if (onItemClickListener == null) {
                v12 = v11;
                t12 = t11;
                i12 = i11;
                baseItemProvider2 = baseItemProvider;
                view.setOnClickListener(new View.OnClickListener() { // from class: io.chad.library.adapter.base.MultipleItemRvAdapter.2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        baseItemProvider2.onClick(v12, t12, i12);
                    }
                });
            } else {
                v12 = v11;
                t12 = t11;
                i12 = i11;
                baseItemProvider2 = baseItemProvider;
            }
            if (onItemLongClickListener == null) {
                final int i13 = i12;
                final T t13 = t12;
                final V v13 = v12;
                final BaseItemProvider baseItemProvider3 = baseItemProvider2;
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: io.chad.library.adapter.base.MultipleItemRvAdapter.3
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        return baseItemProvider3.onLongClick(v13, t13, i13);
                    }
                });
            }
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    public void convert(V v11, T t11) {
        BaseItemProvider baseItemProvider = this.mItemProviders.get(v11.getItemViewType());
        baseItemProvider.mContext = v11.itemView.getContext();
        int layoutPosition = v11.getLayoutPosition() - getHeaderLayoutCount();
        baseItemProvider.convert(v11, t11, layoutPosition);
        bindClick(v11, t11, layoutPosition, baseItemProvider);
    }
}
