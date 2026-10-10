package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public abstract class FilteredBeanPropertyWriter {

    public static final class MultiView extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final BeanPropertyWriter _delegate;
        protected final Class<?>[] _views;

        /* JADX INFO: renamed from: a */
        public final boolean m11791a(Class<?> cls) {
            if (cls == null) {
                return true;
            }
            int length = this._views.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (this._views[i11].isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(AbstractC6393h<Object> abstractC6393h) {
            this._delegate.assignNullSerializer(abstractC6393h);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(AbstractC6393h<Object> abstractC6393h) {
            this._delegate.assignSerializer(abstractC6393h);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public MultiView rename(NameTransformer nameTransformer) {
            return new MultiView(this._delegate.rename(nameTransformer), this._views);
        }

        public MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._views = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
            if (m11791a(abstractC6446m.getActiveView())) {
                super.depositSchemaProperty(interfaceC43404j, abstractC6446m);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
            if (m11791a(abstractC6446m.getActiveView())) {
                this._delegate.serializeAsElement(obj, jsonGenerator, abstractC6446m);
            } else {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, abstractC6446m);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
            if (m11791a(abstractC6446m.getActiveView())) {
                this._delegate.serializeAsField(obj, jsonGenerator, abstractC6446m);
            } else {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, abstractC6446m);
            }
        }
    }

    public static final class SingleView extends BeanPropertyWriter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final BeanPropertyWriter _delegate;
        protected final Class<?> _view;

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(AbstractC6393h<Object> abstractC6393h) {
            this._delegate.assignNullSerializer(abstractC6393h);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(AbstractC6393h<Object> abstractC6393h) {
            this._delegate.assignSerializer(abstractC6393h);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public SingleView rename(NameTransformer nameTransformer) {
            return new SingleView(this._delegate.rename(nameTransformer), this._view);
        }

        public SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
        public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
            Class<?> activeView = abstractC6446m.getActiveView();
            if (activeView != null && !this._view.isAssignableFrom(activeView)) {
                return;
            }
            super.depositSchemaProperty(interfaceC43404j, abstractC6446m);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
            Class<?> activeView = abstractC6446m.getActiveView();
            if (activeView != null && !this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, abstractC6446m);
            } else {
                this._delegate.serializeAsElement(obj, jsonGenerator, abstractC6446m);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
            Class<?> activeView = abstractC6446m.getActiveView();
            if (activeView != null && !this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, abstractC6446m);
            } else {
                this._delegate.serializeAsField(obj, jsonGenerator, abstractC6446m);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static BeanPropertyWriter m11790a(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new SingleView(beanPropertyWriter, clsArr[0]) : new MultiView(beanPropertyWriter, clsArr);
    }
}
