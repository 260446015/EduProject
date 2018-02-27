<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze后台管理系统模板HTML表单页面 - cssmoban</title>
    <meta name="description" content="这是一个form页面">
    <meta name="keywords" content="form">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
</head>
<body>
	<#include "/common/header.ftl">
<div class="am-cf admin-main">
		<#include "/common/sidebar.ftl">
    <div class="admin-content">

        <div class="am-cf am-padding">
            <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">表单</strong> /
                <small>form</small>
            </div>
        </div>

        <div class="am-tabs am-margin" data-am-tabs>
            <ul class="am-tabs-nav am-nav am-nav-tabs">
                <li class="am-active"><a href="#tab1">学生基本信息</a></li>
                <li><a href="#tab2">学生详细描述</a></li>
                <li><a href="#tab3">教学追踪</a></li>
            </ul>

            <div class="am-tabs-bd">
                <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">学校</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="school" value="${student.school}"/>
                            </div>
                        </div>
                    </div>
                    <input type="hidden" value="${student.id}" id="id"/>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">年级</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="gradeLevel" value="${student.gradeLevel}"/>
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">班级</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="nomalClass" value="${student.nomalClass}"/>
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">姓名</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="name" value="${student.name}"/>
                            </div>
                        </div>
                    </div>
                    <input type="hidden" value="${student.id}" id="id"/>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">性别</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                <select id="sex">
                                    <option value="男" <#if student.sex == '男'> selected </#if>>男</option>
                                    <option value="女" <#if student.sex == '女'> selected </#if>>女</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">年龄</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="age" value="${student.age}">
                            </div>
                        </div>
                    </div>
                </div>

                <div class="am-tab-panel am-fade" id="tab2">
                    <form class="am-form">
                        <div class="am-g am-margin-top">
                            <div class="am-u-sm-2 am-text-right">
                                联系方式
                            </div>
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="phone" value="${student.phone}"/>
                            </div>
                            <div class="am-u-sm-6">*必填，不可重复</div>
                        </div>
                        <div class="am-g am-margin-top">
                            <div class="am-u-sm-2 am-text-right">
                                家庭住址
                            </div>
                            <div class="am-u-sm-4">
                                <input type="text" class="am-input-sm" id="address" value="${student.address}"/>
                            </div>
                            <div class="am-u-sm-6">*必填</div>
                        </div>


                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                学习情况
                            </div>
                            <div class="am-u-sm-10">
                                <textarea rows="10" placeholder="请填写实际学习情况" id="description">${student.description}</textarea>
                            </div>
                        </div>

                    </form>
                </div>

                <div class="am-tab-panel am-fade" id="tab3">
                    <form class="am-form">
                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                语文
                            </div>
                            <div class="am-u-sm-4 am-u-end">
                                <select id="chinese" class="teacher">
                                    <#list chinese as c>
                                        <#list student.teachers as t>
                                            <#if t.name == c.name>
                                                <option value="${c.id}" selected>${c.name}</option>
                                            <#else >
                                                <option value="${c.id}">${c.name}</option>
                                            </#if>
                                        </#list>
                                    </#list>
                                </select>
                            </div>
                        </div>
                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                数学
                            </div>
                            <div class="am-u-sm-4 am-u-end">
                                <select id="math" class="teacher">
                                    <#list math as m>
                                        <#list student.teachers as t>
                                            <#if t.name == m.name>
                                                <option value="${m.id}" selected>${m.name}</option>
                                            <#else >
                                                <option value="${m.id}">${m.name}</option>
                                            </#if>
                                        </#list>
                                    </#list>
                                </select>
                            </div>
                        </div>
                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                外语
                            </div>
                            <div class="am-u-sm-4 am-u-end">
                                <select id="english" class="teacher">
                                    <#list english as e>
                                        <#list student.teachers as t>
                                            <#if t.name == e.name>
                                                <option value="${e.id}" selected>${e.name}</option>
                                            <#else >
                                                <option value="${e.id}">${e.name}</option>
                                            </#if>
                                        </#list>
                                    </#list>
                                </select>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>

        <div class="am-margin">
            <button type="button" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
            <button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
        </div>
    </div>
    <!-- content end -->

</div>
<#include "/common/script.ftl">
<#include "/common/link.ftl">
<script src="/assets/student/student.js"></script>
</body>
</html>