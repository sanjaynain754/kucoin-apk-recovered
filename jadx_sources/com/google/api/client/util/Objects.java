package com.google.api.client.util;

/* JADX INFO: loaded from: classes56.dex */
public final class Objects {

    public static final class ToStringHelper {
        private final String className;
        private ValueHolder holderHead;
        private ValueHolder holderTail;
        private boolean omitNullValues;

        public static final class ValueHolder {
            String name;
            ValueHolder next;
            Object value;

            private ValueHolder() {
            }
        }

        private ValueHolder addHolder() {
            ValueHolder valueHolder = new ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z11 = this.omitNullValues;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.className);
            sb2.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                if (!z11 || valueHolder.value != null) {
                    sb2.append(str);
                    String str2 = valueHolder.name;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    sb2.append(valueHolder.value);
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.className = str;
        }

        private ToStringHelper addHolder(String str, Object obj) {
            ValueHolder valueHolderAddHolder = addHolder();
            valueHolderAddHolder.value = obj;
            valueHolderAddHolder.name = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, Object obj) {
            return addHolder(str, obj);
        }
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    private Objects() {
    }

    public static boolean equal(Object obj, Object obj2) {
        return com.google.common.base.Objects.equal(obj, obj2);
    }
}
