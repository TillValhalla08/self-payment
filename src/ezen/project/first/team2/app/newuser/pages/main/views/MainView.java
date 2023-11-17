////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231117FRI_140300] Created
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.newuser.pages.main.views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ezen.project.first.team2.app.common.framework.View;
import ezen.project.first.team2.app.newuser.pages.main.MainPage;
import ezen.project.first.team2.utils.UiUtils;

public class MainView extends View {
	// -------------------------------------------------------------------------

	private JButton mBtn0 = new JButton();

	private JButton mBtn1 = new JButton("추가");
	private JButton mBtn2 = new JButton("초기화");	

	private JLabel mNumLabel = new JLabel("회원 번호");
	private JLabel mNameLabel = new JLabel("이름");
	private JLabel mBirthLabel = new JLabel("생년월일");
	private JLabel mPhoneNumLabel = new JLabel("전화번호");

	private JTextField mNumtf = new JTextField(11);
	private JTextField mNametf = new JTextField(11);
	private JTextField mBirthtf = new JTextField(11);
	private JTextField mPhoneNumtf = new JTextField(11);
	// -------------------------------------------------------------------------

	// 생성자
	public MainView() {
		super(MainPage.VIEW_NUM_MAIN);
	}

	// -------------------------------------------------------------------------

	// 초기화 작업
	@Override
	protected void onInit() {
		super.onInit();
	}

	// 레이아웃 설정
	@Override
	protected void onSetLayout() {
	}

	// 컨트롤 추가
	@Override
	protected void onAddCtrls() {
		// this.mBtn0.setText("버튼0");

		// this.add(this.mBtn0);
		this.add(this.mBtn1);
		this.add(this.mBtn2);

		this.add(this.mNumLabel);
		this.add(this.mNameLabel);
		this.add(this.mBirthLabel);
		this.add(this.mPhoneNumLabel);

		this.add(this.mNumtf);
		this.add(this.mNametf);
		this.add(this.mBirthtf);
		this.add(this.mPhoneNumtf);
	}

	// 이벤트 리스너 추가
	@Override
	protected void onAddEventListeners() {
		this.mBtn0.addActionListener(e -> {
			UiUtils.showMsgBox("버튼0", MainPage.TITLE);
		});
	}

	// 뷰가 표시될 때
	@Override
	protected void onShow() {
		System.out.println("[MainView.onShow()]");
	}

	// 뷰가 숨겨질 때
	@Override
	protected void onHide() {
		System.out.println("[MainView.onHide()]");
	}
}
