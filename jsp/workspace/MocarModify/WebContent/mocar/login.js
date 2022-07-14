
// 회원가입 폼 validation check
function login() {
	let frm = document.loginForm;
	let loginid = frm.loginid;
	let loginpw = frm.loginpw;

	// 아이디 "" 처리
	if (loginid.value == "") {
		alert("아이디를 입력해주세요!");
		loginid.focus();
		return false;
	}

	// 비밀번호 "" 처리
	 if( loginpw.value == "" ){
		 alert("비밀번호를 입력해주세요!");
		 loginpw.focus();
		 return false;
		 
	 }
	

	frm.submit();

}


























