function saveTeacher() {
    var name = $("#name").val();
    var phone = $("#phone").val();
    var job = $("#job").val();
    var salary = $("#salary").val();
    var score = $("#score").val();
    var age = $("#age").val();
    var sex = $("#sex option:selected").val();
    var address = $("#address").val();
    var req = {
        'name': name,
        'phone': phone,
        'job': job,
        'salary': salary,
        'score': score,
        'age': age,
        'sex': sex,
        'address': address
    };
    $.ajax({
        type: 'post',
        contentType: 'application/json',
        data: JSON.stringify(req),
        url: '/apis/teacher/addTeacher.json',
        success: function (res) {
            alert(res.data);
        }
    })
}

$(function () {
    $(".add").on('click', function () {
        window.location.href = '/apis/eduShow/addTeacher.html';
    })
    $(".am-btn-xs").on('click', function () {
        var val = $(this).text();
        if (val == "提交保存") {
            saveTeacher();
        } else {

        }
    })
})