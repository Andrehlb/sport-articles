const { exec } = require('child_process');
const { stdin, stdout, stderr } = require('process');
exec('npm ls --depth=0', (err, stdout, stderr) => {
    if (err) {
        console.log(`Erro: ${err}`);
        return;
    }

    let lines = stdout.split('\n');
    let axiosLine = lines.find(line => line.includes('axios'));

    if (axiosLine) {
        console.log(`Versão do Axios é: ${axiosLine}`);
    } else {
        console.log('Axios não encontrado');
    }

    console.line(`stderr: ${stderr}`);
});

/* no terminal execute node versaoAxios.js para retornar a versão do axios instalada. */