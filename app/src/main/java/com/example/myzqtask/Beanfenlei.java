package com.example.myzqtask;

import java.util.List;

public class Beanfenlei {

    /**
     * info : {"_postman_id":"39b6de3d-21f0-4cce-ab2d-7b6e677d6dd5","name":"商场","description":"商场api","schema":"https://schema.getpostman.com/json/collection/v2.1.0/collection.json"}
     * item : [{"name":"首页","request":{"method":"GET","header":[],"url":{"raw":"https://cdwan.cn/api/index","protocol":"https","host":["cdwan","cn"],"path":["api","index"]}},"response":[]},{"name":"专题","request":{"method":"GET","header":[],"url":{"raw":"https://cdwan.cn/api/topic/list?page=1&size=10","protocol":"https","host":["cdwan","cn"],"path":["api","topic","list"],"query":[{"key":"page","value":"1"},{"key":"size","value":"10"}]}},"response":[]},{"name":"分类竖着导航","request":{"method":"GET","header":[],"url":{"raw":"https://cdwan.cn/api/catalog/index","protocol":"https","host":["cdwan","cn"],"path":["api","catalog","index"]},"description":"请求分类竖导航数据接口\n数据里面的currentCategory数据对应右边的网格布局里面的数据内容"},"response":[]},{"name":"分类右边对应的当前分类的数据","request":{"method":"GET","header":[],"url":{"raw":"https://cdwan.cn/api/catalog/current?id=1005001","protocol":"https","host":["cdwan","cn"],"path":["api","catalog","current"],"query":[{"key":"id","value":"1005001"}]},"description":"用来请求当前分类的列表数据"},"response":[]},{"name":"商品详情列表数据","request":{"method":"GET","header":[],"url":{"raw":"https://cdwan.cn/api/goods/list?categoryId=1005007&page=1&size=100","protocol":"https","host":["cdwan","cn"],"path":["api","goods","list"],"query":[{"key":"categoryId","value":"1005007"},{"key":"page","value":"1"},{"key":"size","value":"100"}]},"description":"点击商品分类右边列表中的商品，打开商品详情页"},"response":[]}]
     * protocolProfileBehavior : {}
     */

    private InfoBean info;
    private ProtocolProfileBehaviorBean protocolProfileBehavior;
    private List<ItemBean> item;

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public ProtocolProfileBehaviorBean getProtocolProfileBehavior() {
        return protocolProfileBehavior;
    }

    public void setProtocolProfileBehavior(ProtocolProfileBehaviorBean protocolProfileBehavior) {
        this.protocolProfileBehavior = protocolProfileBehavior;
    }

    public List<ItemBean> getItem() {
        return item;
    }

    public void setItem(List<ItemBean> item) {
        this.item = item;
    }

    public static class InfoBean {
        /**
         * _postman_id : 39b6de3d-21f0-4cce-ab2d-7b6e677d6dd5
         * name : 商场
         * description : 商场api
         * schema : https://schema.getpostman.com/json/collection/v2.1.0/collection.json
         */

        private String _postman_id;
        private String name;
        private String description;
        private String schema;

        public String get_postman_id() {
            return _postman_id;
        }

        public void set_postman_id(String _postman_id) {
            this._postman_id = _postman_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }
    }

    public static class ProtocolProfileBehaviorBean {
    }

    public static class ItemBean {
        /**
         * name : 首页
         * request : {"method":"GET","header":[],"url":{"raw":"https://cdwan.cn/api/index","protocol":"https","host":["cdwan","cn"],"path":["api","index"]}}
         * response : []
         */

        private String name;
        private RequestBean request;
        private List<?> response;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public RequestBean getRequest() {
            return request;
        }

        public void setRequest(RequestBean request) {
            this.request = request;
        }

        public List<?> getResponse() {
            return response;
        }

        public void setResponse(List<?> response) {
            this.response = response;
        }

        public static class RequestBean {
            /**
             * method : GET
             * header : []
             * url : {"raw":"https://cdwan.cn/api/index","protocol":"https","host":["cdwan","cn"],"path":["api","index"]}
             */

            private String method;
            private UrlBean url;
            private List<?> header;

            public String getMethod() {
                return method;
            }

            public void setMethod(String method) {
                this.method = method;
            }

            public UrlBean getUrl() {
                return url;
            }

            public void setUrl(UrlBean url) {
                this.url = url;
            }

            public List<?> getHeader() {
                return header;
            }

            public void setHeader(List<?> header) {
                this.header = header;
            }

            public static class UrlBean {
                /**
                 * raw : https://cdwan.cn/api/index
                 * protocol : https
                 * host : ["cdwan","cn"]
                 * path : ["api","index"]
                 */

                private String raw;
                private String protocol;
                private List<String> host;
                private List<String> path;

                public String getRaw() {
                    return raw;
                }

                public void setRaw(String raw) {
                    this.raw = raw;
                }

                public String getProtocol() {
                    return protocol;
                }

                public void setProtocol(String protocol) {
                    this.protocol = protocol;
                }

                public List<String> getHost() {
                    return host;
                }

                public void setHost(List<String> host) {
                    this.host = host;
                }

                public List<String> getPath() {
                    return path;
                }

                public void setPath(List<String> path) {
                    this.path = path;
                }
            }
        }
    }
}
