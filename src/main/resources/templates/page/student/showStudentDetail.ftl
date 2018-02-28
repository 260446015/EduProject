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
                                ${student.school}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">年级</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                            ${student.gradeLevel}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">班级</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${student.nomalClass}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">姓名</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${student.name}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">性别</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${student.sex}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">年龄</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${student.age}
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
                                ${student.phone}
                            </div>
                            <div class="am-u-sm-6"></div>
                        </div>
                        <div class="am-g am-margin-top">
                            <div class="am-u-sm-2 am-text-right">
                                家庭住址
                            </div>
                            <div class="am-u-sm-4">
                                ${student.address}
                            </div>
                            <div class="am-u-sm-6"></div>
                        </div>


                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                学习情况
                            </div>
                            <div class="am-u-sm-10">
                                ${student.description}
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
                                <#list student.teachers as t>
                                        <#if t.job == "语文">${t.name}</#if>
                                </#list>
                            </div>
                        </div>
                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                数学
                            </div>
                            <div class="am-u-sm-4 am-u-end">
                                <#list student.teachers as t>
                                        <#if t.job == "数学">${t.name}</#if>
                                </#list>
                            </div>
                        </div>
                        <div class="am-g am-margin-top-sm">
                            <div class="am-u-sm-2 am-text-right">
                                英语
                            </div>
                            <div class="am-u-sm-4 am-u-end">
                                <#list student.teachers as t>
                                    <#if t.job == "英语">${t.name}</#if>
                                </#list>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>
    <!-- content end -->

</div>
<#include "/common/script.ftl">
<#include "/common/link.ftl">
<script src="/assets/student/student.js"></script>
</body>
</html>