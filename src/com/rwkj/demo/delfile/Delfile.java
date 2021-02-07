package com.rwkj.demo.delfile;

import java.io.File;
import java.util.Date;
import java.util.Timer;

public class Delfile {

    public static void main(String[] args) throws Exception {
        Timer t =new Timer();
        //设置日期
        String s = "2018-4-23 16:26:30";
        //日期格式
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d =format.parse(s);
        t.schedule(new DeleteFolder(), d);
    }
}

class DeleteFolder extends java.util.TimerTask{
    @Override
    public void run() {
        //文件路径
        File file = new File("d://8888888Demo//222");
        delteFile(file);
    }
    //递归删除文件及文件夹
    public void delteFile(File file){
        File []filearray=    file.listFiles();
        if(filearray!=null){
            for(File f:filearray){
                if(f.isDirectory()){
                    delteFile(f);
                }else{
                    f.delete();
                }
            }
            file.delete();
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

}

/*
//spring 定时器删除文件夹
@Component
 @EnableScheduling
 public class InitTaskConfig {
   private static Logger logger = LoggerFactory.getLogger(InitTaskConfig.class);
    @Scheduled(cron = "0 0 4 * * ?")
     public void deleteEmailFileTask(){
                logger.info ("清空邮件附件临时文件夹的定时任务开始");
                 Date date = new Date(System.currentTimeMillis() - 1000 * 60 * 60*4);
                File folder = new File(ConfigUtils.get("pdpm.app.delegate.filepath"));
                File[] files = folder.listFiles();
                 for (int i=0;i<files.length;i++){
                    File file = files[i];
                     if (new Date(file.lastModified()).before(date)){
                       file.delete();
                    }
                }
                logger.info ("清空邮件附件临时文件夹的定时任务结束");
            }
 }

 */

/*


@Component
public class TestTimer {

	@Scheduled(cron="0 0 0 * * ?")      //定时任务，每天零点触发
	public void myTimer(){
		try {
			String path=File.createTempFile("datas", ".txt").getPath();		//获取临时文件路径
			File file=new File(path).getParentFile();		//获取临时文件存放的文件夹
			File[] files=file.listFiles();				//取文件夹下所有文件
			for(File f:files){					//遍历删除所有文件
				delete(f);
				System.out.println("当前时间是"+new Date().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


private boolean delete(File file){
    if (file.isDirectory()) {
        String[] children = file.list();
        for (int i=0; i<children.length; i++) {     //递归删除目录中的子目录下
            delete(new File(file, children[i]));
        }
    }
    // 目录此时为空，可以删除
    return file.delete();
}
}
 */
